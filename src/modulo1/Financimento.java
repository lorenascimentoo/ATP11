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

            switch(opcao){
                case 1:
                    System.out.println(); // utilizado apenas para melhorar a visualizacao na saida do terminal
                    System.out.println("-- CREDITO PESSOAL");
                    break;
                case 2:
                    System.out.println(); // utilizado apenas para melhorar a visualizacao na saida do terminal
                    System.out.println("-- CREDITO IMOBILIARIO");
                    break;
                case 3:
                    System.out.println(); // utilizado apenas para melhorar a visualizacao na saida do terminal
                    System.out.println("-- CREDITO EMPRESARIAL");
                    break;
                case 4:
                    System.out.println(); // utilizado apenas para melhorar a visualizacao na saida do terminal
                    System.out.println("-- EMPRESTIMO CONSIGNADO");
                    break;
                default:
                    System.out.println(); // utilizado apenas para melhorar a visualizacao na saida do terminal
                    System.out.println(" ********** OPÇÃO INVÁLIDA!********");
                    System.out.println(); // utilizado apenas para melhorar a visualizacao na saida do terminal
                    break;
            }

        }while(opcao<=0 || opcao>4);

        sc.close();
    }
}