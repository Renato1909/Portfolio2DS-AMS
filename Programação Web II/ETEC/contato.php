<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Contato - ETEC ZL</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header><h1>Fale Conosco</h1></header>
    <nav>
        <a href="index.php">Home</a>
        <a href="cursos.php">Cursos</a>
        <a href="sobre.php">Sobre</a>
        <a href="contato.php">Contato</a>
    </nav>

    <div class="container">
        <?php
        // Lógica simples para processar o formulário (POST)
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $nome = $_POST['nome'];
            echo "<div style='color: green; margin-bottom: 20px;'>Obrigado, $nome! Sua mensagem foi enviada.</div>";
        }
        ?>

        <form method="POST" action="contato.php" id="formContato">
            <div class="form-group">
                <label>Nome:</label>
                <input type="text" name="nome" required>
            </div>
            <div class="form-group">
                <label>E-mail:</label>
                <input type="email" name="email" required>
            </div>
            <div class="form-group">
                <label>Mensagem:</label>
                <textarea name="mensagem" rows="5"></textarea>
            </div>
            <button type="submit" onclick="validarJS()">Enviar Mensagem</button>
        </form>
    </div>

    <script>
        function validarJS() {
            // Pequeno script de alerta como exemplo de JavaScript
            console.log("Tentativa de envio de formulário detectada.");
        }
    </script>
    <script src="scripts.js"></script>
</body>
</html>