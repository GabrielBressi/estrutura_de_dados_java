package com.gabriel.pilhas.exercicios;

import com.gabriel.pilhas.Pilha;
import com.gabriel.pilhas.exercicios.livroforex03.Livro;

import java.util.Scanner;
import java.util.Stack;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Pilha<Livro> livros = new Pilha<>(20);
        Stack<Livro> livros = new Stack<>();
        int option = 1;

        while (option != 0) {
            option = menu(scan);

            switch (option) {
                case 1 :
                    adicionarLivro(scan, livros);
                    break;
                case 2 :
                    peekTopLivros(livros);
                    break;
                case 3 :
                    showPilha(livros);
                    break;
                case 4 :
                    removeLastBook(livros);
                    break;
            }
        }
    }

    private static int menu(Scanner scan) {
        int opt = 1;
        boolean entradaValida = false;
        while (!entradaValida) {
            imprimeLinhaAzul();
            System.out.println("Bem vindo a pilha de livros, digite uma das opções abaixo!");
            System.out.println("(1) Adicionar um novo livro");
            System.out.println("(2) Verificar o livro no topo da pilha");
            System.out.println("(3) Verificar toda a pilha");
            System.out.println("(4) Remover o ultimo livro adicionado na pilha");
            System.out.println("(0) Encerrar o programa");
            imprimeLinhaAzul();

            opt = scan.nextInt();

            if (opt >= 0 && opt <= 4) {
                entradaValida = true;
            }

        }
        return opt;
    }

    /**
     * Opção 1: Adicionar um novo livro
     * */
    private static void adicionarLivro(Scanner scan, Stack<Livro> livros) {
        String nome = readText("Nome: ", scan);
        String isbn = readText("Isbn: ", scan);
        int ano = Integer.parseInt(readText("Ano: ", scan));
        String autor = readText("Autor: ", scan);
        Livro livro = new Livro(
                nome, isbn, ano, autor
        );

        livros.push(livro);
        System.out.println("Livro adicionado na pilha:");
        System.out.println(livros.peek());
    }

    /**
     * Opção 2: Verificar o livro no topo da pilha
     * */
    private static void peekTopLivros(Stack<Livro> livros) {
        imprimeLinhaVermelha();
        if (livros != null) {
            System.out.println("Livro no topo da pilha: ");
            System.out.println(livros.peek());
        } else {
            System.out.println("A pilha está vazia");
        }
        imprimeLinhaVermelha();
    }

    /**
     * Opção 3: Verificar toda a pilha
     * */
    private static void showPilha(Stack<Livro> livros) {
        imprimeLinhaVermelha();
        if (livros != null) {
            System.out.println("Veja a pilha completa: ");
            System.out.println(livros);
        } else {
            System.out.println("A pilha está vazia");
        }
        imprimeLinhaVermelha();
    }

    /**
     * Opção 4: Remove ultimo livro adicionado na pilha
     * */
    private static void removeLastBook(Stack<Livro> livros) {
        imprimeLinhaVermelha();
        if (!livros.isEmpty()) {
            System.out.println("Removendo livro da pilha... ");
            System.out.println("Livro a ser removido:");
            System.out.println(livros.peek());
            livros.pop();
            System.out.println("Livro removido!");
        } else {
            paintText("A pilha está vazia", "31");
        }
        imprimeLinhaVermelha();
    }


    private static String readText(String text, Scanner scan) {
        System.out.print(text);
        return scan.next();
    }

    /**
     * @param text - Write the text you want to paint
     * @param color - the colors can be:
     *              31 - red
     *              32 - blue
     *              33 - green
     *              34 - yellow
     *
     * */
    private static void paintText(String text, String color) {
        System.out.printf("\033[%sm %s \033[m \n", color, text);
    }

    private static void imprimeLinhaVermelha() {
        System.out.println("\033[31m----------------------------------------------------------\033[m");
    }

    private static void imprimeLinhaAzul() {
        System.out.println("\033[32m----------------------------------------------------------\033[m");
    }

}
