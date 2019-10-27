package com.epam.osipchik.data_algorithmes.doulby_linked_list.entity;

import java.util.Objects;

public class Link {

    public long data; // Данные
    public Link next; // Следующий элемент в списке
    public Link previous; // Предыдущий элемент в списке

    public Link(long d){ // Конструктор
     data = d; }
     public void displayLink(Link link){ // Вывод содержимого элемента
     System.out.print(link.data + " "); }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public Link getPrevious() {
        return previous;
    }

    public void setPrevious(Link previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return data == link.data &&
                Objects.equals(next, link.next) &&
                Objects.equals(previous, link.previous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next, previous);
    }

    @Override
    public String toString() {
        return "Link{" +
                "data=" + data +
                ", next=" + next +
                ", previous=" + previous +
                '}';
    }
}

