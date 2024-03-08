package com.gabriel.arvores.testes;

import com.gabriel.arvores.BinarySearchTree;
import com.gabriel.arvores.Node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Suporte04 {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Random rand = new Random();
        int upperbount = 10;
        int r = 0;

        tree.setRoot(new Node(1));

        for (int i = 0; i < 10; i++) {
            r = rand.nextInt(upperbount);
            tree.insert(r);
        }

        Integer[] items = {1, 3, 5, 7, 9};

        for (int item: items) {
            boolean found = tree.search(item);
            if (!found) {
                System.out.println(item + " Não encontrado");
            } else {
                System.out.println(tree.getRoot().getData() + " encontrado");
            }
        }


        System.out.println(tree.getSize());

    }

}
