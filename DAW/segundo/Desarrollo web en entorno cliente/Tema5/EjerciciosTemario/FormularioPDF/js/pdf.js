document.getElementById('generarPDF').addEventListener('click', function () {
    // Crea un nuevo objeto JSPDF
    var doc = new jspdf.jsPDF();

    // Agrega el contenido del formulario al PDF
    doc.text(20, 20, 'Nombre: ' + document.getElementById('nombre').value);
    doc.text(20, 30, 'Apellidos: ' + document.getElementById('apellidos').value);
    doc.text(20, 40, 'Edad: ' + document.getElementById('edad').value);
    doc.text(20, 50, 'NIF: ' + document.getElementById('nif').value);
    doc.text(20, 60, 'Email: ' + document.getElementById('email').value);
    doc.text(20, 70, 'Provincia: ' + document.getElementById('provincia').value);
    doc.text(20, 80, 'Fecha de Nacimiento: ' + document.getElementById('fecha').value);
    doc.text(20, 90, 'Teléfono: ' + document.getElementById('telefono').value);
    doc.text(20, 100, 'Hora de Visita: ' + document.getElementById('hora').value);

    // Guarda el PDF con un nombre específico
    doc.save('formulario.pdf');
});