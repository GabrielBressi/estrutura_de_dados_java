package com.gabriel.pilhas.exercicios;

import java.util.Stack;

public class Ex08 {

    public static void main(String[] args) {
        torreDeHanoi();
    }

    public static void torreDeHanoi() {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        for (int i = 6; i >= 1; i--) {
            stack1.push(i);
        }

        int topo1 = 0;
        int topo2 = 0;
        int topo3 = 0;

        System.out.println("Before: ");
        System.out.println(stack1);
        System.out.println(stack2);
        System.out.println(stack3);

        int test = 0;
        while (test < 30) {
            topo1 = !stack1.isEmpty() ? stack1.peek() : 0;
            topo2 = !stack2.isEmpty() ? stack2.peek() : 0;
            topo3 = !stack3.isEmpty() ? stack3.peek() : 0;

            if (topo2 > topo1 || topo2 == 0) {
                stack2.push(stack1.pop());
            }

            test++;
        }

        System.out.println("After: ");
        System.out.println(stack1);
        System.out.println(stack2);
        System.out.println(stack3);
    }

}
