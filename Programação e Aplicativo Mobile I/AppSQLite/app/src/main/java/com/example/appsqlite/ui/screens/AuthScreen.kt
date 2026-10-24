package com.example.appsqlite.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appsqlite.data.DatabaseHelper

@Composable
fun AuthScreen() {
    val context = LocalContext.current
    val dbHelper = remember { DatabaseHelper(context) }

    var isLoginMode by remember { mutableStateOf(true) }
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }
    var isSuccess by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "AppSQLite",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = if (isLoginMode) "Faça seu login" else "Crie sua conta",
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nome") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                if (name.isBlank() || email.isBlank()) {
                    message = "Preencha todos os campos!"
                    isSuccess = false
                } else {
                    if (isLoginMode) {
                        // Tentar login
                        val user = dbHelper.loginUser(email, name)
                        if (user != null) {
                            message = "Login realizado com sucesso! Bem-vindo, ${user.name}!"
                            isSuccess = true
                        } else {
                            message = "Usuário não encontrado. Verifique seus dados ou cadastre-se."
                            isSuccess = false
                        }
                    } else {
                        // Cadastrar novo usuário
                        val result = dbHelper.insertUser(name, email)
                        if (result != -1L) {
                            message = "Conta criada com sucesso! Faça login para continuar."
                            isSuccess = true
                            // Limpar campos e voltar para login
                            name = ""
                            email = ""
                            isLoginMode = true
                        } else {
                            message = "Este email já está cadastrado!"
                            isSuccess = false
                        }
                    }
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(
                text = if (isLoginMode) "Entrar" else "Cadastrar",
                fontSize = 16.sp
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        TextButton(onClick = {
            isLoginMode = !isLoginMode
            message = ""
            name = ""
            email = ""
        }) {
            Text(
                text = if (isLoginMode) "Não tem conta? Cadastre-se" else "Já tem conta? Faça login"
            )
        }

        if (message.isNotEmpty()) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = message,
                color = if (isSuccess) MaterialTheme.colorScheme.primary
                        else MaterialTheme.colorScheme.error,
                textAlign = TextAlign.Center,
                fontSize = 14.sp
            )
        }
    }
}