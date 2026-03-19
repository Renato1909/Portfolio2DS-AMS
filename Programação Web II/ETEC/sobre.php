<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Sobre a Unidade - ETEC ZL</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header><h1>História e Infraestrutura</h1></header>
    <nav>
        <a href="index.php">Home</a>
        <a href="cursos.php">Cursos</a>
        <a href="sobre.php">Sobre</a>
        <a href="contato.php">Contato</a>
    </nav>

    <div class="container">
        <h2>Conheça a ETEC Zona Leste</h2>
        <p>A ETEC Zona Leste é uma instituição de ensino que faz parte do Centro Paula Souza.</p>
        
        <blockquote>
            "Nossa missão é formar profissionais capacitados para o mercado de trabalho com ética e inovação."
        </blockquote>

        <p>Localizada na Avenida Águia de Haia, a unidade conta com laboratórios modernos e professores especialistas.</p>
        
        <?php 
            $data_fundacao = 2002; // Exemplo de dado dinâmico
            $idade = date("Y") - $data_fundacao;
            echo "<p><em>Atuando na região há mais de $idade anos.</em></p>";
        ?>
    </div>

    <footer><p>&copy; 2026 - ETEC Zona Leste</p></footer>
    <script src="scripts.js"></script>
</body>
</html>