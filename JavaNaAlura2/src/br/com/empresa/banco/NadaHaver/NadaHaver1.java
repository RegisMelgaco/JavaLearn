package br.com.empresa.banco.NadaHaver;

public class NadaHaver1 {
    public static void drama(String palavra) {
        for (int i = palavra.length(); i > 0; i--) {
            System.out.print(palavra.charAt(i - 1));
        }
    }

    public static String nadaMelhorPraFazer(String frase) {
        int x;
        int y = frase.length();
        String contrario = "";

        while(frase.lastIndexOf(" ") != -1) {
            x = frase.lastIndexOf(" ");
            contrario = contrario + frase.substring(x + 1, y) + " ";
            frase = frase.substring(0,x) + "_" + frase.substring(x + 1, y);

            y = x;
        }
        contrario = contrario + frase.substring(0,y);

        return contrario;
    }

    public static int nadeMelhorPraFazer2(String x) {
        char c = x.charAt(0);
        int r = 0;

        for (int k = x.length() - 1; k >= 0; k--) {
            c = x.charAt(k);

            r += (c - '0') * Math.pow(10,x.length() - k);
        }

        return r / 10;
    }

    public static void teste() {
    }
}
