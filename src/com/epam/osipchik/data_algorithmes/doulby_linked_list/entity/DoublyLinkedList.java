package com.epam.osipchik.data_algorithmes.doulby_linked_list.entity;

import java.util.Objects;

public class DoublyLinkedList {
    private Link first; // Ссылка на первый элемент списка
    private Link last; // Ссылка на последний элемент списка
    public DoublyLinkedList(){ // Конструктор
        first = null; // Список пока не содержит элементов
        last = null;
    }
    public Link getFirst() {
        return first;
    }
    public void setFirst(Link first) {
        this.first = first;
    }
    public Link getLast() {
        return last;
    }
    public void setLast(Link last) {
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoublyLinkedList that = (DoublyLinkedList) o;
        return Objects.equals(first, that.first) &&
                Objects.equals(last, that.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    @Override
    public String toString() {
        return "DoublyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }
}

