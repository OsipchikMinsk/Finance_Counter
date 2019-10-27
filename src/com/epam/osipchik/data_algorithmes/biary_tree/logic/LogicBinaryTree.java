package com.epam.osipchik.data_algorithmes.biary_tree.logic;
import com.epam.osipchik.data_algorithmes.biary_tree.entity.BinaryTree;
import com.epam.osipchik.data_algorithmes.biary_tree.entity.Node;

import java.io.IOException;

public class LogicBinaryTree {

    public void add(int value, BinaryTree binaryTree) { //добавление элемента рекурсивный проход
        if (binaryTree.getRoot() == null) {
            binaryTree.setRoot(new Node(value)); //если корень вставляем занчение в корень
            return;
        }
        add(binaryTree.getRoot(), value);
    }

    private void add (Node node, int value){
        if(value>node.getData()){
            if (node.getRight()==null){
                node.setRight(new Node(value));
            }else {
                add(node.getRight(),value);
            }
        }
        if (value<node.getData()){
            if (node.getLeft() == null){
                node.setLeft(new Node(value));
            }else {
                add(node.getLeft(),value);
            }
        }

    }

    public Node nodeSearch(int value, BinaryTree binaryTree) { //рекурсивный поиск элемента
        if (binaryTree.getRoot() == null) {
            return null;
        }
        return nodeSearch(value, binaryTree.getRoot());

    }
    private Node nodeSearch(int value, Node node) {
        if (node == null) {
            return null;
        }
        if (value == node.getData()) {
            return node;
        }
        if (value > node.getData()) {
            return nodeSearch(value, node.getRight());
        } else {
            return nodeSearch(value, node.getLeft());
        }
    }

    public void print(BinaryTree binaryTree) {  //печать бинарного дерева, коряво, но по слоям, рекурсивно
        if (binaryTree.getRoot() == null)
            return;
        print(binaryTree.getRoot(), 0);
    }

    private void print(Node node, int level) {
        if (node != null) {
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(node.getData());
            print(node.getLeft(), level + 1);
            print(node.getRight(), level + 1);
        }
    }
    public int sum(BinaryTree binaryTree) {
        if (binaryTree.getRoot() == null)
            return 0;
        return sum(binaryTree.getRoot());
    }

    private int sum(Node node) {
        int sum = 0;
        if (node != null) {
            sum += sum(node.getLeft());
            sum += sum(node.getRight());
            sum += node.getData();
        }
        return sum;
    }

    public Node maxNode(BinaryTree binaryTree) { //нахождение максимального значения в дереве, рекурсивно
        if (binaryTree.getRoot() != null)
            return maxNode(binaryTree.getRoot());
        return null;
    }

    private Node maxNode(Node node) {
        if (node.getRight() == null)
            return node;
        return maxNode(node.getRight());
    }

    public Node searchParent(int value, BinaryTree binaryTree) {  //нахождение родителя значения. Знечение выше
        if (binaryTree.getRoot() == null) {
            return null;
        }
        if (binaryTree.getRoot().getData() == value) {
            //особая ситуация
            return null;
        }
        return searchParent(value, binaryTree.getRoot());
    }

    private Node searchParent(int value, Node node) {
        if (value > node.getData()) {
            if (node.getRight() == null) {
                return null;
            }
            if (node.getRight().getData() == value) {
                return node;
            }
            return searchParent(value, node.getRight());
        } else {
            if (node.getLeft() == null) {
                return null;
            }
            if (node.getLeft().getData() == value) {
                return node;
            }
            return searchParent(value, node.getLeft());
        }
    }
    public Node removeItem(int value, BinaryTree binaryTree) { //удаление элемента из дерева, с перезаписывание элементов, котроые попали в сдвиги
        if (binaryTree.getRoot() == null) {
            return null;
        }
        Node parentItem = searchParent(value, binaryTree.getRoot());
        Node removeItem = nodeSearch(value, binaryTree.getRoot());
        if (parentItem == null || removeItem == null) {
            return null;
        }
        Node newLinkFromParent;
        if (removeItem.getRight() == null && removeItem.getLeft() == null) {
            newLinkFromParent = null;
        } else if (removeItem.getLeft() == null && removeItem.getRight() != null) {
            newLinkFromParent = removeItem.getRight();
        } else if (removeItem.getLeft() != null && removeItem.getRight() == null) {
            newLinkFromParent = removeItem.getLeft();
        } else {
            newLinkFromParent = removeItem.getLeft();
            Node maxItem = maxNode(removeItem.getLeft());
            maxItem.setRight(removeItem.getRight());
        }
        if (parentItem.getRight() == removeItem) {
            parentItem.setRight(newLinkFromParent);
        } else {
            parentItem.setLeft(newLinkFromParent);
        }
        return removeItem;
    }
}
