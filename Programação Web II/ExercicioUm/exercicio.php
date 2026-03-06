<html>


<head>
    <title>Exercício Um Sobre PHP</title>
</head>

<body>

<?php

//Declarando as variáveis relacionadas ao exercício.

$varNome = "Renato"; // Variável do tipo string, que armazena meu nome.
$varSobrenome = "Aparecido da Silva"; // Variável do tipo string, que armazena meu sobrenome.
$varCompleto = $varNome . " " . $varSobrenome; // Variável do tipo string, que armazena meu nome completo, concatenando as variáveis de nome e sobrenome.
$varIdade = 16; // Variável do tipo inteiro, que armazena minha idade.
$varData = "19/12/2009"; // Variável do tipo string, que armazena minha data de nascimento.

echo"Exercício sobre PHP "; // Imprime o título do exercício.
print"<P>"; // Imprime uma quebra de linha.

echo"Meu nome completo é: "; // Imprime meu nome completo.
echo $varCompleto;
print "<P>";

echo"Minha idade é: "; // Imprime minha idade.
echo $varIdade;
print "<P>";

echo"Minha data de nascimento é: "; // Imprime minha data de nascimento.
echo $varData;
print "<P>";

?>

</body>

</html>