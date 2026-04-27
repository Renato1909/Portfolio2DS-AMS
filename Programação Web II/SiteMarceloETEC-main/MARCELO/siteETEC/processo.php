<?php
$nome = $_POST['nome'];
$email = $_POST['email'];
$telefone = $_POST['telefone'];
$curso = $_POST['curso'];
$mensagem = $_POST['mensagem'];
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Confirmação</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="processo.css">
</head>

<body>

<div class="page-wrapper">
    <div class="box mx-auto">
        <h1>Olá, <?php echo $nome; ?>!</h1>

    <p>
        Email -  <strong><?php echo $email; ?></strong>
    </p>

    <p>
        Telefone -  <strong><?php echo $telefone; ?></strong>
    </p>

    <p>
        Você foi matriculado no curso de <strong><?php echo $curso; ?></strong>
    </p>

    <p>
        Mensagem -  <strong><?php echo $mensagem; ?></strong>
    </p>

    <p>Muito obrigado pela mensagem! </p>

    <a href="index.html" class="btn btn-danger mt-3">Voltar ao site</a>
    </div>
</div>

<footer class="text-white pt-4 mt-5 w-100" style="background-color:#b02a37;">
    <div class="container-fluid px-3 px-md-5">
        <div class="row">

            <div class="col-md-3">
                <h5>ETEC Zona Leste</h5>
                <p>Ensino técnico de qualidade.</p>
            </div>

            <div class="col-md-3">
                <h5>Links</h5>
                <ul class="list-unstyled">
                    <li><a href="#" class="text-white">Início</a></li>
                    <li><a href="quemSomos.html" class="text-white">Quem Somos</a></li>
                    <li><a href="vestibulinho.html" class="text-white">Vestibulinho</a></li>
                    <li><a href="formulario.html" class="text-white">Formulário</a></li>
                </ul>
            </div>

            <div class="col-md-3">
                <h5>Contato</h5>
                <p>📍 São Paulo - SP</p>
                <p>📞 (11) 0000-0000</p>
                <p>✉️ etec@email.com</p>
            </div>

            <div class="col-md-3">
                <h5>Horário</h5>
                <p>Seg - Sex: 08h às 22h</p>
                <p>Sábado: 08h às 12h</p>


                <h5 class="mt-3">Redes</h5>
                 <a href="https://www.facebook.com/Eteczonalesteoficial/?locale=pt_BR" class="text-white">Facebook</a><br>
                <a href="https://www.instagram.com/eteczonalesteoficial" class="text-white">Instagram</a><br>
                <a href="https://www.youtube.com/@etecdazonaleste2949" class="text-white">YouTube</a>
            </div>

        </div>

        <hr>

        <div class="text-center pb-3">
            © 2026 ETEC Zona Leste
        </div>
    </div>
</footer>

</body>
</html>