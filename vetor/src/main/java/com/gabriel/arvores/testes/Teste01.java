package com.gabriel.arvores.testes;

import com.gabriel.arvores.BinaryTree;
import com.gabriel.arvores.Node;

public class Teste01 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        n1.setRight(new Node(4));
        n2.setLeft(new Node(5));
        tree.getRoot().setLeft(n1);
        tree.getRoot().setRight(n2);

        tree.inOrder(n1);
    }

}
