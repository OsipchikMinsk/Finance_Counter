package com.epam.osipchik.data_algorithmes.biary_tree;

import com.epam.osipchik.data_algorithmes.biary_tree.entity.BinaryTree;
import com.epam.osipchik.data_algorithmes.biary_tree.logic.LogicBinaryTree;

public class BinaryTreeApp {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        LogicBinaryTree logicBinaryTree = new LogicBinaryTree();
        logicBinaryTree.add(20, binaryTree);
        logicBinaryTree.add(22, binaryTree);
        logicBinaryTree.add(19, binaryTree);
        logicBinaryTree.add(1, binaryTree);
        logicBinaryTree.add(25, binaryTree);
        logicBinaryTree.add(65, binaryTree);
        logicBinaryTree.print(binaryTree);
        System.out.println(logicBinaryTree.nodeSearch(65,binaryTree).getData());
        System.out.println(binaryTree.getRoot().getData());
        System.out.println(logicBinaryTree.searchParent(25,binaryTree).getData());
        System.out.println(logicBinaryTree.maxNode(binaryTree).getData());
        System.out.println(logicBinaryTree.sum(binaryTree));
        logicBinaryTree.removeItem(25,binaryTree);
        logicBinaryTree.print(binaryTree);


    }


}
