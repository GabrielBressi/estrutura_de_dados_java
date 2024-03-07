package com.gabriel.arvores;

public class BinaryTree<T> {

    private Node<T> root;

    private int size = 0;

    public BinaryTree() {
        this.root = null;
        this.size = 0;
    }
    public BinaryTree(T data) {
        Node<T> node = new Node<>(data);
        this.root = node;
        this.size++;
    }

    /**
     * Percurso em ordem simétrica
     * @param node The root of your binary tree
     * */
    public void inOrder(Node<T> node){
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

    }

    /**
     * Percurso em PÓS ORDEM
     * @param node
     * */
    public void postOrder(Node<T> node) {
        if (node.getLeft() != null) {
            this.postOrder(node.getLeft());
        }
        if (node.getRight() != null) {
            this.postOrder(node.getRight());
        }
        System.out.print(node);
    }

    public void postOrder() {
        Node<T> node = this.root;
        if (node.getLeft() != null) {
            this.postOrder(node.getLeft());
        }
        if (node.getRight() != null) {
            this.postOrder(node.getRight());
        }
        System.out.print(node);
    }

    public int height(Node<T> node) {
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


    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
