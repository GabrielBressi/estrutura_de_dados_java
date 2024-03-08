package com.gabriel.arvores.testes;

import com.gabriel.arvores.BinarySearchTree;
import com.gabriel.arvores.Node;
import com.sun.source.tree.BinaryTree;

import java.util.Random;

public class Suporte05 {

    public static void main(String[] args) throws Exception {
        BinarySearchTree bst = exampleTree();

        /*System.out.println("Percurso linear: ");
        bst.inOrder();
        System.out.println();*/
        System.out.println("--------------------------------");
        System.out.println("Percurso em nivel");
        bst.levelOrderTraversal();
        /*max(bst);
        min(bst);*/

        //System.out.println("\n"+bst.remove(16, bst.getRoot()));
        System.out.println("\n"+bst.delete(61, bst.getRoot()));

        /*System.out.println("Percurso linear: ");
        bst.inOrder();
        System.out.println();*/
        System.out.println("--------------------------------");
        System.out.println("Percurso em nivel");
        bst.levelOrderTraversal();


    }

    public static void max(BinarySearchTree tree) {
        System.out.printf("\nO maior valor na árvore é: %d", tree.max());
    }

    public static void min(BinarySearchTree tree) {
        System.out.printf("\nO menor valor na árvore é: %d", tree.min());
    }

    public static BinarySearchTree exampleTree() {
        BinarySearchTree tree = new BinarySearchTree();
        Integer[] values = {89, 66, 43, 51, 16, 20, 55, 11, 79, 77, 82, 32};

        tree.setRoot(new Node(61));
        for (int v: values) {
            tree.insert(v);
        }
        return tree;
    }

}
