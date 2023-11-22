package Atividades2;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        
        Scanner intScanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int n1 = intScanner.nextInt();

        if (n1 > 18) {
            System.out.println("Voce e adulto");              

        } else if (n1 == 18) {
            System.out.println("Voce e adulto");         

        } else {
            System.out.println("Voce e de menor");               

        intScanner.close();

    }
  }
}