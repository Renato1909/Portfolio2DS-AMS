<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Cursos - ETEC Zona Leste</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header><h1>Nossos Cursos</h1></header>
    <nav>
        <a href="index.php">Home</a>
        <a href="cursos.php">Cursos</a>
        <a href="sobre.php">Sobre</a>
        <a href="contato.php">Contato</a>
    </nav>

    <div class="container">
        <div class="XPO"> <?php 
                $cursos = [
                    "Desenvolvimento de Sistemas",
                    "Logística",
                    "Administração",
                    "Contabilidade",
                    "Serviços Jurídicos"
                ];

                echo "<h2>Grade de Cursos Oferecidos</h2>";
                echo "<ul>";
                foreach ($cursos as $curso) {
                    echo "<li><strong>$curso</strong> - ETEC Zona Leste</li>";
                }
                echo "</ul>";
            ?>
        </div>
    </div>

    <footer><p>&copy; 2026 - ETEC Zona Leste</p></footer>
    <script src="scripts.js"></script>
</body>
</html>