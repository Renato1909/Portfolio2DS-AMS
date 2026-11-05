package com.example.appsqlite.data

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(
    context, DATABASE_NAME, null, DATABASE_VERSION
) {
    companion object {
        private const val DATABASE_NAME = "app_sqlite.db"
        private const val DATABASE_VERSION = 1
        private const val TABLE_NAME = "users"
        private const val COLUMN_ID = "id"
        private const val COLUMN_NAME = "name"
        private const val COLUMN_EMAIL = "email"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createTable = """
            CREATE TABLE $TABLE_NAME (
                $COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT,
                $COLUMN_NAME TEXT NOT NULL,
                $COLUMN_EMAIL TEXT NOT NULL UNIQUE
            )
        """.trimIndent()
        db.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    fun insertUser(name: String, email: String): Long {
        val db = writableDatabase
        val values = ContentValues().apply {
            put(COLUMN_NAME, name)
            put(COLUMN_EMAIL, email)
        }
        return db.insert(TABLE_NAME, null, values)
    }

    fun getAllUsers(): List<User> {
        val users = mutableListOf<User>()
        val db = readableDatabase
        val cursor = db.query(
            TABLE_NAME,
            arrayOf(COLUMN_ID, COLUMN_NAME, COLUMN_EMAIL),
            null, null, null, null, null
        )
        with(cursor) {
            while (moveToNext()) {
                users.add(
                    User(
                        id = getInt(getColumnIndexOrThrow(COLUMN_ID)),
                        name = getString(getColumnIndexOrThrow(COLUMN_NAME)),
                        email = getString(getColumnIndexOrThrow(COLUMN_EMAIL))
                    )
                )
            }
        }
        cursor.close()
        return users
    }

    fun loginUser(email: String, name: String): User? {
        val db = readableDatabase
        val cursor = db.query(
            TABLE_NAME,
            arrayOf(COLUMN_ID, COLUMN_NAME, COLUMN_EMAIL),
            "$COLUMN_EMAIL = ? AND $COLUMN_NAME = ?",
            arrayOf(email, name),
            null, null, null
        )
        var user: User? = null
        with(cursor) {
            if (moveToFirst()) {
                user = User(
                    id = getInt(getColumnIndexOrThrow(COLUMN_ID)),
                    name = getString(getColumnIndexOrThrow(COLUMN_NAME)),
                    email = getString(getColumnIndexOrThrow(COLUMN_EMAIL))
                )
            }
        }
        cursor.close()
        return user
    }
}