package com.gabriel.arvores.testes;

import com.gabriel.arvores.BinaryTree;
import com.gabriel.arvores.Node;

public class Suporte {

    /*
             '+'
          /      \
        'a'      '*'
               /    \
             'b'    '-'
                   /   \
                 '/'   'e'
                /  \
              'c'  'd'
     */
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node n1 = new Node('a');
        Node n2 = new Node('+');
        Node n3 = new Node('*');
        Node n4 = new Node('b');
        Node n5 = new Node('-');
        Node n6 = new Node('/');
        Node n7 = new Node('c');
        Node n8 = new Node('d');
        Node n9 = new Node('e');

        n6.setLeft(n7);
        n6.setRight(n8);
        n5.setLeft(n6);
        n5.setRight(n9);
        n3.setLeft(n4);
        n3.setRight(n5);
        n2.setLeft(n1);
        n2.setRight(n3);

        tree.setRoot(n2);

        tree.postOrder(n2);


    }

}
