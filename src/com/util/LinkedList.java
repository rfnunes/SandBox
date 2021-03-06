package com.util;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class LinkedList<T> {

    private LinkedListNode<T> head;

    private LinkedListNode<T> tail;

    public LinkedList(LinkedListNode<T> head) {
        this.head = this.tail = head;
    }

    public LinkedListNode<T> getHead() {
        return head;
    }

    public LinkedListNode<T> getTail() {
        return tail;
    }

    public void add(LinkedListNode<T> node) {
        if(tail != null) {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
        else {
            head = tail = node;
        }
    }

    public static <T> LinkedList<T> reverse(LinkedList<T> linkedList) {
        LinkedList<T> newLinkedList = new LinkedList<>(null);
        LinkedListNode<T> node = linkedList.getTail();
        while(node != null) {
            LinkedListNode<T> newNode = new LinkedListNode<>(node.getObject());
            newNode.setPrevious(node.getNext());
            newNode.setNext(node.getPrevious());
            newLinkedList.add(newNode);
            node = node.getPrevious();
        }
        return newLinkedList;
    }

    public static <T> LinkedList<T> reverse2(LinkedList<T> linkedList) {
        LinkedListNode<T> head = linkedList.getHead();
        LinkedListNode<T> current = head;
        while (current.getNext() != null) {
            LinkedListNode<T> next = current.getNext();

            current.setNext(current.getPrevious());
            current.setPrevious(next);

            current = next;
        }
        linkedList.setHead(current);
        linkedList.setTail(head);
        return linkedList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkedList<?> that = (LinkedList<?>) o;

        LinkedListNode<T> node = this.head;
        LinkedListNode<?> thatNode = that.getHead();
        while(node != null || thatNode != null) {
            if(!Objects.equals(node, thatNode)) {
                return false;
            }
            node = node.getNext();
            thatNode = thatNode.getNext();
        }
        return true;
    }

    @Override
    public int hashCode() {

        return Objects.hash(head, tail);
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

    public void setHead(LinkedListNode<T> head) {
        this.head = head;
    }

    public void setTail(LinkedListNode<T> tail) {
        this.tail = tail;
    }

    public static class LinkedListNode<T> {

        private LinkedListNode<T> previous, next;

        private T object;

        public LinkedListNode(T object) {
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

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            LinkedListNode<?> that = (LinkedListNode<?>) o;
            return Objects.equals(object, that.object);
        }

        @Override
        public int hashCode() {
            return Objects.hash(object);
        }

        @Override
        public String toString() {
            return object.toString();
        }
    }

    public LinkedListIterator<T> iterator() {
        return new LinkedListIterator<>(head);
    }

    public static class LinkedListIterator<T> implements Iterator<LinkedListNode<T>> {

        private LinkedListNode<T> nextNode;

        private LinkedListNode<T> node;

        public LinkedListIterator(LinkedListNode<T> node) {
            this.node = node;
            this.nextNode = node.next;
        }

        @Override
        public boolean hasNext() {
            return nextNode != null;
        }

        @Override
        public LinkedListNode<T> next() {
            nextNode = node.next;
            return node;
        }
    }

    public static <T> LinkedList<T> fill(List<T> elements) {

        if(elements.size() == 0) {
            return new LinkedList<>(null);
        }

        Iterator<T> iterator = elements.iterator();
        LinkedListNode<T> head = new LinkedListNode<>(iterator.next());

        LinkedList<T> tLinkedList = new LinkedList<>(head);

        if(elements.size() > 1) {

            while (iterator.hasNext()) {
                tLinkedList.add(new LinkedListNode<>(iterator.next()));
            }
        }

        return tLinkedList;
    }
}
