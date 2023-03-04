package edu.paulo.anatomiadeclasse;

public class Main {
public static void main (String [] args) {
        String primeiroNome = "Cruzeiro";
        String segundoNome = "Cabuloso";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }
public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}