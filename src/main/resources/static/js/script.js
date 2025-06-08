const slides = document.querySelectorAll('.carrusel_imagen');
let current = 0;

function nextSlide() {
  slides[current].classList.remove('active');
  current = (current + 1) % slides.length;
  slides[current].classList.add('active');
}

setInterval(nextSlide, 3500); // Cambia cada 5 segundos

