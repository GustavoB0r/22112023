package Atividades2;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        String Vusername = "teste";
        String Vsenha = "teste";
        Scanner inputText = new Scanner(System.in);

        System.out.println("Enter username");
        String username = inputText.nextLine();

        System.out.println("Enter senha");
        String senha = inputText.nextLine();

        if (Vusername.equals(username) & Vsenha.equals(senha)) {
            System.out.println("Bem vindo ao sistema");
        } else {
            System.out.println("Usuario ou senha incorreta");
        }

        inputText.close();
    }
}
