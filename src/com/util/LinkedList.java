package com.util;

import java.util.List;

public class LinkedList<T> {

    private LinkedListNode<T> head;

    public LinkedList(LinkedListNode<T> head) {
        this.head = head;
    }

    public LinkedListNode<T> getHead() {
        return head;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkedList{");

        LinkedListNode<T> node = head;
        while(node != null) {
            sb.append(node.getObject());
            sb.append(", ");
            node = node.getNext();
        }

        sb.append("}");

        return sb.toString();
    }

    public static class LinkedListNode<T> {

        private LinkedListNode<T> previous, next;

        private T object;

        LinkedListNode(T object) {
            this.object = object;
        }

        public T getObject() {
            return object;
        }

        public LinkedListNode<T> getPrevious() {
            return previous;
        }

        public void setPrevious(LinkedListNode<T> previous) {
            this.previous = previous;
        }

        public LinkedListNode<T> getNext() {
            return next;
        }

        public void setNext(LinkedListNode<T> next) {
            this.next = next;
        }
    }

    public static <T> LinkedList<T> fill(List<T> elements) {

        LinkedListNode<T> head = null;
        LinkedListNode<T> previous = null;

        for (T element : elements) {
            LinkedListNode<T> current = new LinkedListNode<>(element);

            if(head == null) {
                head = current;
            }

            if (previous != null) {
                previous.setNext(current);
            }
            current.setPrevious(previous);
            previous = current;
        }

        return new LinkedList<>(head);
    }
}
