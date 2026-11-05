// Espera o DOM carregar
document.addEventListener("DOMContentLoaded", function() {
    console.log("JavaScript da ETEC carregado com sucesso!");

    const form = document.getElementById("formContato");

    if (form) {
        form.addEventListener("submit", function(event) {
            const nome = document.querySelector('input[name="nome"]').value;
            const email = document.querySelector('input[name="email"]').value;

            // Validação simples
            if (nome.trim() === "" || email.trim() === "") {
                alert("Por favor, preencha os campos obrigatórios!");
                event.preventDefault(); // Impede o envio do formulário (POST)
            } else {
                alert("Enviando seus dados, " + nome + "...");
            }
        });
    }

    // Efeito de destaque ao passar o mouse nos cursos
    const itensCurso = document.querySelectorAll("li");
    itensCurso.forEach(item => {
        item.addEventListener("mouseover", () => {
            item.style.color = "#b11116";
            item.style.fontWeight = "bold";
        });
        item.addEventListener("mouseout", () => {
            item.style.color = "black";
            item.style.fontWeight = "normal";
        });
    });
});