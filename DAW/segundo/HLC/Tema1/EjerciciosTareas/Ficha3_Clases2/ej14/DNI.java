package ej14;

public class DNI {
    private int numeroDni;

    public DNI(int numeroDni) {
        this.numeroDni = numeroDni;
    }

    public int getNumeroDni() {
        return numeroDni;
    }

    public String getNIF() {
        return Integer.toString(numeroDni) + calcularLetraNIF(numeroDni);
    }

    public void setDni(String nif) throws Exception {
        if (validarNIF(nif)) {
            this.numeroDni = extraerNumeroDni(nif);
        } else {
            throw new Exception("El NIF introducido no es válido");
        }
    }

    public void setDni(int numeroDni) throws Exception {
        if (String.valueOf(numeroDni).length() == 8) {
            this.numeroDni = numeroDni;
        } else {
            throw new Exception("El DNI introducido no es válido");
        }
    }

    private static char calcularLetraNIF(int numeroDni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";                                                                
        return letras.charAt(numeroDni % 23);
    }

    private static boolean validarNIF(String nif) {
        boolean valido = false;
        if (nif.length() == 9 && extraerLetraNIF(nif) == calcularLetraNIF(extraerNumeroDni(nif))) {
            valido = true;
        }
        return valido;
    }

    private static char extraerLetraNIF(String nif) {
        return nif.charAt(nif.length()-1);
    }

    private static int extraerNumeroDni(String nif) {
        switch (nif.charAt(0)) {
            case 'X': nif = '0' + nif.substring(1); break;
            case 'Y': nif = '1' + nif.substring(1); break;
            case 'Z': nif = '2' + nif.substring(1); break;
            default: break;
        }
        return Integer.parseInt(nif.substring(0, 8));
    }
}