package com.gabriel.arvores;

public class BinarySearchTree extends BinaryTree{

    public void insert(int data) {
        if (this.root == null) {
            this.root = new Node(data);
            return;
        }

        Node parent = new Node();
        Node x = this.root;

        while (x != null) {
            parent = x;
            if (data < x.getData()) {
                x = x.getLeft();
            } else {
                x = x.getRight();
            }
        }

        if (parent == null) {
            this.setRoot(new Node(data));
            size++;
        } else if (data < parent.getData()) {
            parent.setLeft(new Node(data));
            size++;
        } else {
            parent.setRight(new Node(data));
            size++;
        }
    }


    /**
     * Busca Binária
     * @param data
     * @return BinarySearchTree&lt;T&gt;
     * */
    public boolean search(int data) {
        return search(data, this.root);
    }

    private boolean search(int data, Node node) {
        boolean found = false;

        while ((node != null) && !found) {
            int rval = node.getData();

            if (data < rval){
                node = node.getLeft();
            } else if (data > rval) {
                node = node.getRight();
            } else {
                found = true;
                break;
            }
        }

        return found;
    }

    public int max() {
        Node node = this.root;

        while (node.getRight() != null) {
            node = node.getRight();
        }

        return node.getData();
    }

    public int min() {
        Node node = this.root;

        while (node.getLeft() != null) {
            node = node.getLeft();
        }

        return node.getData();
    }

    public Node min(Node node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }

        return node;
    }


    /**
     *
     * @param value
     * @param node if you to use the root, use null
     * */
    public Node remove(int value, Node node) {
        if (node == null) {
            return node;
        }

        if (value < node.getData()) {
            node.setLeft(this.remove(value, node.getLeft()));
        } else if (value > node.getData()) {
            node.setRight(this.remove(value, node.getRight()));
        } else {
            if (node.getLeft() == null) { // leaves cases
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            } else {
                Node substitute = this.min(node.getRight());
                node.setData(substitute.getData());
                node.setRight(this.remove(substitute.getData(), node.getRight()));
            }
        }

        return node;
    }

    /*public BinarySearchTree<T> search(int data, Node<T> node) {
        if (node == null) {
            node = this.root;
        }

        if (node == null || Integer.parseInt(node.getData().toString()) == data) {
            return new BinarySearchTree<>(node);
        }

        if (data < Integer.parseInt(node.getData().toString())) {
            return this.search(data, node.getLeft());
        }

        return this.search(data, node.getRight());
    }*/


    public Node delete(int value, Node node) {
        if (value < node.getData()) {
            node.setLeft(this.delete(value, node.getLeft()));
        } else if (value > node.getData()) {
            node.setRight(this.delete(value, node.getRight()));
        } else {
            if (node.getLeft() == null) {
                return node.getLeft();
            } else if (node.getRight() == null) {
               return node.getRight();
            } else {
                Node substitute = this.min(node.getRight());
                node.setData(substitute.getData());
                node.setRight(substitute.getRight());
                substitute.setLeft(null);
                substitute.setRight(null);
                substitute.setData(0);
            }
        }
        return node;
    }
}
