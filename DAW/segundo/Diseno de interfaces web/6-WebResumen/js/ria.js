// Función para validar el correo electrónico
function validateEmail(email) {
    // Expresión regular para validar el formato de correo electrónico
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regex.test(email);
}

// Evento de envío del formulario
document.getElementById('formularioRegistro').addEventListener('submit', function (event) {
    // Detenemos el envío del formulario por defecto
    event.preventDefault();

    // Validamos el correo electrónico ingresado
    const emailInput = document.getElementById('email');
    const emailError = document.getElementById('emailError');

    if (!validateEmail(emailInput.value)) {
        // Si el correo electrónico no es válido, mostramos el mensaje de error
        emailError.style.display = 'block';
    } else {
        // Si el correo electrónico es válido, enviamos el formulario
        this.submit();
    }
});