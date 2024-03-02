package com.gabriel.vetor.exercicios;

import com.gabriel.vetor.Lista;
import com.gabriel.vetor.teste.Contato;

import java.util.Scanner;

// TODO: Ex07 mesmo que o 06, porém usando o ArrayList
public class Ex06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lista<Contato> contatos = new Lista<>(20);

        criarContatos(5, contatos);

        int option = 1;
        while (option != 0) {
            option = displayMenu(scan);
            switch (option) {
                case 1: createContato(contatos, scan);
                break;
                case 2 : createContatoInIndex(contatos, scan);
                break;
                case 3 : getContatoByIndex(contatos, scan);
                break;
                case 4 : getContatoByIndex(contatos, scan);
                break;
                case 5 : getContatoByIndex(contatos, scan);
                break;
                case 6 : getContatoByIndex(contatos, scan);
                break;
                case 7 : getContatoByIndex(contatos, scan);
                break;
                case 8 : getContatoByIndex(contatos, scan);
                break;
            }
        }
    }

    private static String readInfo(String text, Scanner scan) {
        System.out.print(text);
        String data = null;
        try {
            data = scan.nextLine();
        } catch (Exception e) {
            System.out.println("Parsing error");
        }
        return data;
    }
    private static void displayMessage(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\033[32m------------------------------------\n");
        stringBuilder.append(str1 + "\n");
        stringBuilder.append(str2 + "\n");
        stringBuilder.append("------------------------------------\033[m \n");
        System.out.println(stringBuilder);
    }
    private static void criarContatos(int quantidade, Lista<Contato> lista) {
        Contato contato;
        for (int i = 1; i <= quantidade; i++) {
            contato = new Contato(
                    "Contato" + i,
                    "5555-555" + i,
                    "contato" + i + "@gmail.com"
            );
            lista.adiciona(contato);
        }
    }

    /**
     * Option #1
     * */
    private static void createContato(Lista<Contato> contatos, Scanner scan) {
        String name = readInfo("Name: ", scan);
        String tel = readInfo("Telefone: ", scan);
        String email = readInfo("Email: ", scan);
        Contato contato = new Contato(name, tel, email);
        contatos.adiciona(contato);
        int pos = contatos.busca(contato);
        displayMessage(String.valueOf(contatos.get(pos)), "Contato criado na posição: " + pos + "\n");
    }

    /**
     * Option #2
     * */
    private static void createContatoInIndex(Lista<Contato> contatos, Scanner scan) {
        String name = readInfo("Name: ", scan);
        String tel = readInfo("Telefone: ", scan);
        String email = readInfo("Email: ", scan);
        String pos = readInfo("Posição: ", scan);
        Contato contato = new Contato(name, tel, email);
        if (contatos.get(Integer.parseInt(pos)) != null) {
            contatos.adiciona(Integer.parseInt(pos), contato);

        }
        displayMessage(String.valueOf(Integer.parseInt(pos)), "");
    }

    /**
     * Option #3
     * */
    private static void getContatoByIndex(Lista<Contato> contatos, Scanner scan) {
        System.out.print("Digite a posição: ");
        int pos = scan.nextInt();
        displayMessage(String.valueOf(contatos.get(pos)), "");
    }

    private static int displayMenu(Scanner scan) {
        boolean entradaValida = false;
        int option = 0;
        String entrada;
        do {
            System.out.println("Digite a opção desejada ");
            System.out.println("Criar contato [1] ");
            System.out.println("Criar contato em um determinada posição [2]");
            System.out.println("Buscar contato por posição [3]");
            System.out.println("Buscar contato por nome [4]");
            System.out.println("Remover contato por posição [5]");
            System.out.println("Remover todos os contatos [6]");
            System.out.println("Para parar o programa [0]");
            System.out.print("Digite a opção desejada: ");

            try {
                entrada = scan.nextLine();
                option = Integer.parseInt(entrada);

                if(option >= 0 && option <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente \n");
            }
        } while (!entradaValida);

        return option;
    }

}
