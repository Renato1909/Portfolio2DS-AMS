<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultado - Cálculo de Salário</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h1>Resultado</h1>
        <?php
            if ($_SERVER["REQUEST_METHOD"] == "POST") {
                $horas = floatval($_POST["txthoras"]);
                $valor = floatval($_POST["txtvalor"]);

                if ($horas <= 0 || $valor <= 0) {
                    echo "<p class='erro'>Por favor, insira valores válidos maiores que zero.</p>";
                } else {
                    $salario = $horas * $valor;
                    echo "<div class='resultado'>";
                    echo "<p>Horas Trabalhadas: <strong>" . number_format($horas, 2, ",", ".") . "h</strong></p>";
                    echo "<p>Valor da Hora: <strong>R$ " . number_format($valor, 2, ",", ".") . "</strong></p>";
                    echo "<p class='salario-final'>Salário Total: <strong>R$ " . number_format($salario, 2, ",", ".") . "</strong></p>";
                    echo "</div>";
                }
            }
        ?>
        <a href="index.php" class="btn-voltar">Voltar</a>
    </div>
</body>
</html>