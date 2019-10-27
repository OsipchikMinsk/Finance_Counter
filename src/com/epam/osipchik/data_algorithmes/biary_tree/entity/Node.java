package com.epam.osipchik.data_algorithmes.biary_tree.entity;

public class Node {

    private int data;  //значение узла
    private Node right;  //ссылка вправо
    private Node left;  //ссылка влево

    public Node(int data) {
        this.data = data;
        this.right = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

}
