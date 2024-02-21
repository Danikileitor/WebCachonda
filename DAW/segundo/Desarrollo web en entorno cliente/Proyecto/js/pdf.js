var doc;

function prepararPDF() {
    // Variables
    var pdfRA = document.getElementById('losRA');
    var pdfCriterio = document.getElementById('losCriterios');

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

    // Información de las imágenes
    //var juntaData = 'data:image/jpeg;base64,'+ Base64.encode('img/junta.jpg');

    // Agrega el contenido del formulario al PDF
    //doc.addImage(juntaData, 'JPEG', 15, 40, 180, 160);
    doc.text(20, 20, 'Lenguaje de Marcas');
    doc.text(20, 30, pdfRA.options[pdfRA.selectedIndex].text);
    doc.text(20, 40, pdfCriterio.options[pdfCriterio.selectedIndex].text);
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
    iframe.height = '1177px';
});