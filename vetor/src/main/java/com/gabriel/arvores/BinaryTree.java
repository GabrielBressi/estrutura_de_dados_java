package com.gabriel.arvores;

import com.gabriel.filas.Fila;
import com.gabriel.lista.No;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryTree {

    protected Node root;

    protected int size;


    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(int data) {
        this.root = new Node(data);
        size++;
    }

    /**
     * Percurso em ordem simétrica
     * @param node The root of your binary tree
     * */
    public void inOrder(Node node){
        if (node.getLeft() != null) {
            this.inOrder(node.getLeft());
        }
        System.out.printf("%s ", node.toString());
        if (node.getRight() !=null) {
            this.inOrder(node.getRight());
        }
    }

    public void inOrder(){
        Node node = this.root;
        if (node.getLeft() != null) {
            this.inOrder(node.getLeft());
        }
        System.out.printf("%s ", node.toString());
        if (node.getRight() !=null) {
            this.inOrder(node.getRight());
        }
    }

    /*public void inOrder(Node<T> node){
        if (node == null) {
            node = this.root;
        }
        if (node.getLeft() != null) {
            System.out.print("(");
            this.inOrder(node.getLeft());
        }
        System.out.printf("%s ", node.toString());
        if (node.getRight() !=null) {
            this.inOrder(node.getRight());
            System.out.print(")");
        }

    }*/



    /**
     * Percurso em PÓS ORDEM
     * @param node
     * */
    public void postOrder(Node node) {
        if (node.getLeft() != null) {
            this.postOrder(node.getLeft());
        }
        if (node.getRight() != null) {
            this.postOrder(node.getRight());
        }
        System.out.print(node);
    }

    public void postOrder() {
        Node node = this.root;
        if (node.getLeft() != null) {
            this.postOrder(node.getLeft());
        }
        if (node.getRight() != null) {
            this.postOrder(node.getRight());
        }
        System.out.print(node);
    }

    public void levelOrderTraversal(Node node) throws Exception {
        Fila<Node> fila = new Fila<>();

        fila.enfileira(node);
         while (!fila.isEmpty()) {
             node = fila.desenfilera();
             if (node.getLeft() != null) fila.enfileira(node.getLeft());
             if (node.getRight() != null) fila.enfileira(node.getRight());
            System.out.print(node + " ");
             if (fila.tamanho() % 2 == 0) {
                 System.out.print("|");
             }
         }

    }

    public void levelOrderTraversal() throws Exception {
        Queue<Node> queue = new LinkedList<>();
        Node node = this.root;
        /*int maior = node.getData();
        int menor = node.getData();*/
        queue.add(node);
        while (!queue.isEmpty()) {
            node = queue.remove();
            /*if (node.getData() > maior) maior = node.getData();
            if (node.getData() < menor) menor = node.getData();*/
            if (node.getLeft() != null) queue.add(node.getLeft());
            if (node.getRight() != null) queue.add(node.getRight());
            System.out.print(node + " ");

        }
        /*System.out.println("\nO \033[34mmaior\033[m valor da árvore é : " + maior);
        System.out.println("\nO \033[31mmenor\033[m valor da árvore é : " + menor);*/
    }



    public int height(Node node) {
        if (node == null) {
            node = this.root;
        }
        int hleft = 0;
        int hright = 0;
        if (node.getLeft() != null) {
            hleft = this.height(node.getLeft());
        }
        if (node.getRight() != null) {
            hright = this.height(node.getRight());
        }

        if (hright > hleft) {
            return hright + 1;
        }

        return hleft + 1;
    }


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
