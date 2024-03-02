package com.gabriel.javabasico;

public class Aula35 {

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fatorial(n-1);
    }

}
