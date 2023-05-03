package ejerciciopersona;

public class Principal {
    public static void main(String[] args) {
        //Creamos a los empleados:
        Empleado e1, e2, e3;
        e1 = new Empleado("Ja1Ro", (byte) 19, 1.76, "12345678Z", 5);
        e2 = new Empleado("Joseca", (byte) 20, 1.78, "12345679W", 899.98);
        e3 = new Empleado("Fernando", (byte) 34, 1.74, "12345678Z", 3264.16);
        e1.saludar();
        e2.saludar();
        e3.saludar();
    }
}
