package modulo1;

import java.util.Scanner;

public class Financimento {

    public static void main(String[] args) {
        System.out.println("========= BRADESCO FINANCIMENTOS =========");

        Scanner sc = new Scanner(System.in);
        byte opcao;
        do{
            System.out.println("\t--- OPÇÕES DE FINANCIAMENTOS ---");
            System.out.println("1 - CREDITO PESSOAL");
            System.out.println("2 - CREDITO IMOBILIARIO");
            System.out.println("3 - CREDITO EMPRESARIAL");
            System.out.println("4 - EMPRESTIMO CONSIGNADO");
            
            System.out.print("Insira a opcao desejada: ");
            opcao = Byte.parseByte(sc.nextLine());

        }while(opcao<=0 || opcao>4);

        sc.close();
    }
}