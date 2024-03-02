package com.gabriel.lista.testes;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.addFirst(0);
        list.addLast(3);

        System.out.println(list.contains(3));
        list.add(2, 2);

        System.out.println(list);
        list.remove();
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

    }

}
