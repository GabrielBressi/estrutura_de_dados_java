package com.gabriel.arvores.testes;

import com.gabriel.arvores.BinarySearchTree;
import com.gabriel.arvores.Node;

public class Suporte03 {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        Node n1 = new Node(61);
        Node n2 = new Node(43);
        Node n3 = new Node(89);

        tree.setRoot(n1);
        n1.setLeft(n2);
        n1.setRight(n3);

        tree.inOrder(n1);

        tree.insert(16);
        System.out.println();
        tree.inOrder(n1);


        tree.insert(11);
        System.out.println();
        tree.inOrder(n1);

        tree.insert(66);
        System.out.println();
        tree.inOrder(n1);
    }

}
