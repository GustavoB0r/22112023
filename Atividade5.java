package Atividades2;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
                Scanner intScanner = new Scanner(System.in);

        System.out.print("Digite apenas o numero em centimetros da altura do seu pacote: ");
        int altura = intScanner.nextInt();

        System.out.print("Digite apenas o numero em centimetros do comprimento do seu pacote: ");
        int comp = intScanner.nextInt();

        System.out.print("Digite apenas o numero em centimetros da largura do seu pacote: ");
        int largura = intScanner.nextInt();

        if (altura <= 20 & comp <= 30 & largura <= 10) {
            System.out.println("Seu pacote e valido para entrega");              

        } else if (altura > 20 || comp > 30 || largura > 10) {
            System.out.println("Seu pacote e INVALIDO para entrega");         

        } else {
            System.out.println("Algo deu errado na leitura dos valores do pacote");               

        intScanner.close();
    }
  }
}
