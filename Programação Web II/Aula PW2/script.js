let slideIndex = 0;
const slides = document.querySelectorAll(".slide");

function mostrarSlide(index) {
    slides.forEach(slide => slide.classList.remove("active"));
    slides[index].classList.add("active");
}

function mudarSlide(direcao) {
    slideIndex += direcao;

    if (slideIndex >= slides.length) {
        slideIndex = 0;
    }

    if (slideIndex < 0) {
        slideIndex = slides.length - 1;
    }

    mostrarSlide(slideIndex);
}

// Inicializa o primeiro slide
document.addEventListener("DOMContentLoaded", () => {
    mostrarSlide(slideIndex);
});