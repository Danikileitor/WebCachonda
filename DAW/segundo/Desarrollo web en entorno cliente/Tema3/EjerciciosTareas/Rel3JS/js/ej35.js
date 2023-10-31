function ej35() {
    var num;
    num = Math.random() * 3; //se guarda en num un valor comprendido entre 0.00001 y 2.99999
    num = parseInt(num); //guardamos solo la parte entera de la variable num
    switch (num) {
        case 0:
            window.location = 'http://www.hotmail.com';
            break;
        case 1:
            window.location = 'http://mail.google.com';
            break;                
        case 2:
            window.location = 'http://www.yahoo.com';
            break;
    }
}