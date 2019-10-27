package com.epam.osipchik.data_algorithmes;

import com.epam.osipchik.data_algorithmes.doulby_linked_list.entity.DoublyLinkedList;
import com.epam.osipchik.data_algorithmes.doulby_linked_list.logic.LogicDoublyLinkedList;

public class DoublyLinkedApp {

    /*@Author Osipchyk Artsiom
    Алгоритм взят из книги Роберта Лафоре "Структуры данных и aлгоритмы" и переделан по принципам ООП
    */
    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();
        LogicDoublyLinkedList logWorker = new LogicDoublyLinkedList();
        logWorker.insertFirst(25, theList);
        logWorker.insertFirst(26, theList);
        logWorker.insertLast(40, theList);
        logWorker.insertLast(41, theList);
        logWorker.displayForward(theList);
        logWorker.insertAfter(25, 400, theList);
        System.out.println(theList.getFirst().getData());
        System.out.println(theList.getLast().getData());
        System.out.println("Удаляемый элемент " + logWorker.deleteFirst(theList).data);
        System.out.println(theList.getFirst().getData());
        logWorker.displayForward(theList);
        logWorker.displayBackward(theList);
        logWorker.deleteKey(400, theList);
        logWorker.displayBackward(theList);

    }
}

