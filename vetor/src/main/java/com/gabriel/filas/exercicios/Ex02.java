package com.gabriel.filas.exercicios;

import com.gabriel.filas.FilaComPrioridade;
import com.gabriel.pilhas.Pilha;

import java.util.Scanner;

public class Ex02 {

    private static final String PRIORITARIO = "prioritario";
    private static final  String COMUM = "comum";

    public static void main(String[] args) throws Exception {
        FilaComPrioridade<Pessoa> filaComum = new FilaComPrioridade<>();
        FilaComPrioridade<Pessoa> filaPrioritario = new FilaComPrioridade<>();

        Scanner scan = new Scanner(System.in);
        Pilha<Pessoa> pilha = new Pilha<>();

        int option = 1;
        while (option != 0) {
            option = displayMenu(scan);

            switch (option) {
                case 1: getSenha(filaComum, filaPrioritario, scan);
                break;
                case 2: chamarSenha(filaComum, filaPrioritario, pilha);
                break;
                case 3: checkFila(filaComum, filaPrioritario);
            }
        }


    }

    /**
     * @param filaComum
     * @param filaPrioritario
     */
    public static void checkFila(FilaComPrioridade<Pessoa> filaComum, FilaComPrioridade<Pessoa> filaPrioritario) {
        System.out.println(filaComum);
        System.out.println(filaPrioritario);
    }

    /**
     * Display the menu
     * @param scan
     * */
    public static int displayMenu(Scanner scan) {
        boolean isValid = false;
        int option = 0;
        while (!isValid) {
            System.out.println("Digite 1 para gerar uma senha");
            System.out.println("Digite 2 para chamar uma senha \033[32m(desenfilerar)\033[m");
            System.out.println("Digite 3 para checar a fila");
            System.out.println("Digite 0 para encerrar o programa");
            System.out.print("Sua Opção > ");
            option = scan.nextInt();

            if (option >= 0 && option <=3) {
                isValid = true;
            } else {
                System.out.println("\033[31mDigite uma opção válida!\033[m");
            }
        }
        return option;
    }


    /**
     * @param filaComum
     * @param filaPrioritario
     * @param pilha
     * */
    public static void chamarSenha(FilaComPrioridade<Pessoa> filaComum, FilaComPrioridade<Pessoa> filaPrioritario, Pilha<Pessoa> pilha) throws Exception {
        if (pilha.tamanho() == 3) {
            for (int i = 0; i < 3; i++) {
                pilha.pop();
            }
            try {
                System.out.printf("Pessoa chamada: " + filaComum.desenfilera() + "\n");
            } catch (Exception e) {
                throw new Exception("Erro ao chamar proximo comum. ", e);
            }
        } else {
            Pessoa ultimaSenhaChamada = filaPrioritario.desenfilera();
            pilha.push(ultimaSenhaChamada);

            System.out.print("Pessoa chamada: ");
            System.out.println(ultimaSenhaChamada);
        }

    }



    /**
     * Criar uma senha e enfilera a pessoa
     * @param filaComum
     * @param filaPrioritario
     * @param scan
     * */
    public static void getSenha(FilaComPrioridade<Pessoa> filaComum, FilaComPrioridade<Pessoa> filaPrioritario, Scanner scan) {
        String name = readString("Digite seu nome: ", scan);
        int idade = readInt("Digite sua idade: ", scan);
        Pessoa p = new Pessoa();
        p.setName(name);

        String tipo = checkPrioridade(idade, p);

        if (tipo.equals(COMUM)) {
            filaComum.enfileira(p);
        } else {
            filaPrioritario.enfileira(p);
        }
    }

    public static String checkPrioridade(int idade, Pessoa p) {
        if (idade < 60) {
            p.setTipo(COMUM);
        } else {
            p.setTipo(PRIORITARIO);
        }

        if (p.getTipo().equals(COMUM)) {
            p.setPrioridade(0);
        } else if (p.getTipo().equals(PRIORITARIO)) {
            p.setPrioridade(1);
        }

        if (p.getTipo().equals(PRIORITARIO)) {
            return PRIORITARIO;
        }

        return COMUM;
    }


    /**
     * @param text
     * @param scan
     * */
    public static String readString(String text, Scanner scan) {
        System.out.print(text);
        return scan.next();
    }

    /**
     * @param text
     * @param scan
     * */
    public static int readInt(String text, Scanner scan) {
        System.out.print(text);
        return scan.nextInt();
    }
}
