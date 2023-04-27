package ej17_Daniel;

public class Cifrado {

    public static String cesar(String codigo, int n) {
        String aux = "";
        int longitudAlfabeto = 26;
        for (int i = 0; i < codigo.length(); i++) {
            char c = codigo.charAt(i);
            if (Character.isLetter(c)) {
                char inicioAlfabeto = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - inicioAlfabeto + n + longitudAlfabeto) % longitudAlfabeto + inicioAlfabeto);
            }
            aux += c;
        }
        return aux;
    }
}
