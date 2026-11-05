<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>ETEC Zona Leste - Home</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header>
        <h1>ETEC Zona Leste</h1>
    </header>
    
    <nav>
        <a href="index.php">Home</a>
        <a href="cursos.php">Cursos</a>
        <a href="sobre.php">Sobre</a>
        <a href="contato.php">Contato</a>
    </nav>

    <div class="container">
        <?php 
            $saudacao = "Bem-vindo ao portal oficial da ETEC Zona Leste!";
            echo "<h2>$saudacao</h2>";
        ?>
        <p>Excelência em ensino técnico e tecnológico na região leste de São Paulo.</p>
    </div>

    <footer>
        <p>&copy; <?php echo date("Y"); ?> - ETEC Zona Leste</p>
    </footer>
    <script src="scripts.js"></script>
</body>
</html>