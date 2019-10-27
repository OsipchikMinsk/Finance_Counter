package com.epam.osipchik.data_algorithmes.doulby_linked_list.logic;

import com.epam.osipchik.data_algorithmes.doulby_linked_list.entity.DoublyLinkedList;
import com.epam.osipchik.data_algorithmes.doulby_linked_list.entity.Link;

public class LogicDoublyLinkedList {

    public boolean isEmpty(DoublyLinkedList dll) // true, если список пуст
    { return dll.getFirst()==null; }

    public void insertFirst(long dd, DoublyLinkedList dll) // Вставка элемента в начало списка
    {
        Link newLink = new Link(dd); // Создание нового элемента
        if( isEmpty(dll) ) {// Если список не содержит элементов,
            dll.setLast(newLink); // newLink <-- last
        }else {
            dll.getFirst().previous = newLink; // newLink <-- старое значение first
        }
        newLink.next = dll.getFirst(); // newLink --> старое значение first
        dll.setFirst(newLink); // first --> newLink
    }
    public void insertLast(long dd, DoublyLinkedList dll){ // элемент в конец списка

        Link newLink = new Link(dd); // Создание нового элемента
        if( isEmpty(dll) ) { // Если список не содержит элементов,
            dll.setFirst(newLink);  // first --> newLink
        }else{
            dll.getLast().next = newLink; // старое значение last --> newLink
            newLink.previous = dll.getLast(); // старое значение last <-- newLink
        }
        dll.setLast(newLink); // newLink <-- last
    }
    public Link deleteFirst(DoublyLinkedList dll){ // Удаление первого элемента
     // (предполагается, что список не пуст)
        Link temp = dll.getFirst();
        if( dll.getFirst().next == null) { // Если только один элемент
            dll.setLast(null);  // null <-- last
        } else {
            dll.getFirst().next.previous = null; // null <-- старое значение next
        }
        dll.setFirst(dll.getFirst().next);// first --> старое значение next
        return temp;
    }
    public Link deleteLast(DoublyLinkedList dll){ // Удаление последнего элемента
     // (предполагается, что список не пуст)
        Link temp =dll.getLast();
        if(dll.getFirst().next == null) { // Если только один элемент
            dll.setFirst(null); // first --> null
        }else {
          dll.getLast().previous.next = null; // старое значение previous --> null
        }
          dll.setLast(dll.getLast().previous);  // старое значение previous <-- last
        return temp;
    }
    public boolean insertAfter(long key, long dd,DoublyLinkedList dll )
    { // (предполагается, что список не пуст)
        Link current =dll.getFirst(); // От начала списка
        while(current.data != key){ // Пока не будет найдено совпадение

            current = current.next; // Переход к следующему элементу
            if(current == null) {
                return false; // Ключ не найден
            }
        }
        Link newLink = new Link(dd); // Создание нового элемента
        if(current== dll.getLast()){ // Для последнего элемента списка
           newLink.next = null; // newLink --> null
           dll.setLast(newLink); // newLink <-- last
        }
        else{ // Не последний элемент
            newLink.next = current.next; // newLink --> старое значение next
            current.next.previous = newLink;// newLink <-- старое значение next
        }
        newLink.previous = current; // старое значение current <-- newLink
        current.next = newLink; // старое значение current --> newLink
        return true; // Ключ найден, вставка выполнена
    }
    public Link deleteKey(long key, DoublyLinkedList dll) // Удаление элемента с заданным ключом
    { // (предполагается, что список не пуст)
        Link current = dll.getFirst(); // От начала списка
        while(current.data != key){ // Пока не будет найдено совпадение
            current = current.next; // Переход к следующему элементу
            if(current == null)
                return null; // Ключ не найден
        }
        if(current==dll.getFirst()) { // Ключ найден; это первый элемент?
            dll.setFirst(current.next); // first --> старое значение next
        }else { // Не первый элемент
            current.previous.next = current.next;// старое значение previous --> старое значение next
        }
        if(current==dll.getLast()) { // Последний элемент?
            dll.setLast(current.previous);  // старое значение previous <-- last
        }else { // Не последний элемент
            current.next.previous = current.previous;// Старое значение previous <-- старое значение next
        }
        return current; // Возвращение удаленного элемента
    }
    public void displayForward(DoublyLinkedList dll){
        System.out.print("List (first-->last): ");
        Link current = dll.getFirst(); // От начала списка
        while(current != null){ // Перемещение до конца списка
            current.displayLink(current); // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }
    public void displayBackward(DoublyLinkedList dll){
        System.out.print("List (last-->first): ");
        Link current = dll.getLast(); // От начала списка
        while(current != null){ // Перемещение до конца списка
            current.displayLink(current); // Вывод данных
            current = current.previous; // Переход к следующему элементу
        }
        System.out.println("");
    }

}

