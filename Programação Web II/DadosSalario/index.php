<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cálculo de Salário</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h1>Cálculo de Salário</h1>
        <form action="calcularSalario.php" method="post">
            <label for="txthoras">Horas Trabalhadas:</label>
            <input type="number" name="txthoras" id="txthoras" step="0.01" min="0" required placeholder="Ex: 160">

            <label for="txtvalor">Valor da Hora (R$):</label>
            <input type="number" name="txtvalor" id="txtvalor" step="0.01" min="0" required placeholder="Ex: 25.50">

            <div class="buttons">
                <input type="submit" value="Calcular">
                <input type="reset" value="Limpar">
            </div>
        </form>
    </div>
</body>
</html>