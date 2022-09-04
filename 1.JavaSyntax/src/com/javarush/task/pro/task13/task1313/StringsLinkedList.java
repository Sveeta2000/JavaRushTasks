package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        var one = last.prev;
        Node newItem = new Node();
        newItem.value = value;
        if (one != null) {
            one.next = newItem;
            newItem.prev = one;
        } else {
            first.next = newItem;
            newItem.prev = first;
        }
        last.prev = newItem;


    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
