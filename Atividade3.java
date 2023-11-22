package Atividades2;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);

        System.out.println("Digite uma frase qualquer");
        String frase = stringScanner.nextLine();

        boolean temNumero = false;

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isDigit(frase.charAt(i))) {
                temNumero = true;
                break; 
            }
        }

        if (temNumero) {
            System.out.println("A frase possui numeros.");
        } else {
            System.out.println("A frase nao possui numeros.");
        }

        intScanner.close();
        stringScanner.close();
    }
}
