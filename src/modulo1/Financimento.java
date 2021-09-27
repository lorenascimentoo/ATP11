package modulo1;

import java.util.Scanner;

public class Financimento {

    public static void main(String[] args) {
        System.out.println("========= BRADESCO FINANCIMENTOS =========");

        Scanner sc = new Scanner(System.in);
        byte opcao;
        char acao='V';
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

            
            if(opcao>0 && opcao<=4){
                System.out.println("\t *** OPERAÇÃO REALIZADA COM SUCESSO! ***\n");
                do{
                    System.out.println("V - VOLTAR AO MENU PRINCIPAL | S - SAIR DO SISTEMA");
                    System.out.print("Insira a acao que deseja realizar: ");
                    acao = sc.nextLine().toUpperCase().charAt(0); // pega a string, transforma em maiusculo e depois atribui apenas o primeiro caracter a variavel    
                    if(acao!='S' && acao!='V'){
                        System.out.println("\n ** OPCAO INVALIDA!** \n");
                    }
                }while(acao!='S' && acao!='V');
            }

        }while(opcao<=0 || opcao>4 || acao=='V');

        if(acao == 'S'){
            System.out.println("\n \tOBRIGADO!\n");
        }
        sc.close();
    }
}