var doc;

function prepararPDF() {
    // Crea un nuevo objeto JSPDF
    doc = new jspdf.jsPDF();

    // Agregamos los metadatos al PDF
    doc.setProperties({
        title: 'Formulario',
        subject: 'Prueba PDF',
        author: 'Daniel Marcos Guerra Gómez',
        keywords: 'formulario, pdf, daw, dwec',
        creator: 'Daniel Marcos Guerra Gómez'
    });

    // Agrega el contenido del formulario al PDF
    doc.text(20, 20, 'Lenguaje de Marcas');
    doc.text(20, 30, document.getElementById('losRA').value);
    doc.text(20, 40, document.getElementById('losCriterios').value);
}

document.getElementById('generarPDF').addEventListener('click', function () {
    // Crea un nuevo objeto JSPDF
    prepararPDF();

    // Guarda el PDF con un nombre específico
    doc.save('formulario.pdf');
});

document.getElementById('previsualizarPDF').addEventListener('click', function () {
    // Crea un nuevo objeto JSPDF
    prepararPDF();

    // Obtiene la URL del PDF como un blob y editar el iframe
    var blobPDF = doc.output('bloburl');
    var iframe = document.getElementById('iframe');
    iframe.src = blobPDF;
    iframe.width = '100%';
    iframe.height = '500px';
});