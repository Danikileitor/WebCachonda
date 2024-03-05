var doc;

function prepararPDF() {
    // Variables
    var pdfRA = document.getElementById('losRA');
    var modulo = document.getElementById('modulo');
    var profesor = document.getElementById('profesor');
    var pdfCriterio = document.getElementById('losCriterios');
    var RASeleccionado = document.getElementById('RASeleccionado');
    var criterioSeleccionado = document.getElementById('criterioSeleccionado');
    var peso = document.getElementById('peso');
    var peso2 = document.getElementById('peso2');
    var fuente = document.getElementById('fuente');
    var fuente2 = document.getElementById('fuente2');

    // Preparar la tabla
    RASeleccionado.innerHTML = pdfRA.options[pdfRA.selectedIndex].text;
    criterioSeleccionado.innerHTML = pdfCriterio.options[pdfCriterio.selectedIndex].text;
    peso2.innerHTML = peso.value + " %";
    fuente2.innerHTML = fuente.value;

    // Crea un nuevo objeto JSPDF
    var options = {
        orientation: 'p',
        unit: 'mm',
        format: 'a4',
        putOnlyUsedFonts: true,
        compress: true,
        precision: 2,
        userUnit: 1.0
    };
    doc = new jspdf.jsPDF(options);

    // Agregamos los metadatos al PDF
    doc.setProperties({
        title: 'Formulario',
        subject: 'Prueba PDF',
        author: 'Daniel Marcos Guerra Gómez',
        keywords: 'formulario, pdf, daw, dwec',
        creator: 'Daniel Marcos Guerra Gómez'
    });

    // Información de las imágenes
    var imgJunta = new Image;
    var imgMurgi = new Image;
    imgJunta.src = "img/junta.jpg";
    imgMurgi.src = "img/murgi.png";

    // Agrega el contenido del formulario al PDF
    const centrar = (doc.internal.pageSize.width || doc.internal.pageSize.getWidth()) / 2;
    doc.addImage(imgJunta, "JPEG", 5, 5, 50, 32);
    doc.addImage(imgMurgi, "PNG", 162, 8, 40, 38);
    doc.setFont(undefined, 'bold');
    doc.setFontSize(12);
    doc.text(centrar, 60, 'Unidad Didáctica', { align: 'center' });
    doc.text(centrar, 70, 'Módulo: ' + modulo.innerHTML, { align: 'center' });
    doc.text(centrar, 80, 'Profesor: ' + profesor.value, { align: 'center' });
    doc.setFont(undefined, 'normal');
    doc.setFontSize(10);
    doc.autoTable({ html: '#tablapdfresultado', startY: 90, useCss: true });
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