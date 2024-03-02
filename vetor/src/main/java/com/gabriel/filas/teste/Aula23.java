package com.gabriel.filas.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

    //private static Queue<Integer> queue;

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue);
        System.out.println(queue.peek());
    }


}
