package com.gabriel.arvores.testes;

import com.gabriel.arvores.BinaryTree;
import com.gabriel.arvores.Node;

public class Suporte02 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        Node n1 = new Node('3');
        Node n2 = new Node('E');
        Node n3 = new Node('5');
        Node n4 = new Node('I');
        Node n5 = new Node('R');
        Node n6 = new Node('A');
        Node n7 = new Node('N');
        Node n8 = new Node('C');
        Node n9 = new Node('V');
        Node n10 = new Node('S');
        Node n11 = new Node('-');

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n11);
        n6.setRight(n9);
        n5.setLeft(n7);
        n5.setRight(n8);
        n8.setRight(n10);

        tree.setRoot(n1);

        tree.postOrder();
        System.out.println();
        System.out.println("Altura: " + tree.height(n5));
    }

}
