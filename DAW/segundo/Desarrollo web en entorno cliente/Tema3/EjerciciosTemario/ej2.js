function coche(modelo, color, kms, combustible) {
    this.modelo = modelo;
    this.color = color;
    this.kms = kms;
    this.combustible = combustible;
}
var elmio = new coche("Mercedes E330", "negro", 120000, "diésel");
var eltuyo = new coche("BMV 318", "blanco", 210000, "gasolina");
delete elmio.matrícula;
console.log(elmio);
//se puede comprobar que no ha funcionao el delete porque no existe dicho atributo.
//Para que funcione se tiene que hacer de la sigueinte forma:
delete elmio.modelo;
console.log(elmio);