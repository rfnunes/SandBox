package com.evaluation;

import com.util.LinkedList;

public class HasLoop {

    public static void main(String[] args) {
        new HasLoop().go();
    }

    private void go() {
        System.out.println(hasLoop(getLinkedList().getHead()));
    }

    private <T> boolean hasLoop(LinkedList.LinkedListNode<T> head) {

        LinkedList.LinkedListNode<T> stepOne = head;
        LinkedList.LinkedListNode<T> stepTwo = head;

        int counter = 0;


        while(stepOne.getNext() != null) {
            counter++;
            if(counter % 2 == 0) {
                stepTwo = stepTwo.getNext();
            }

            stepOne = stepOne.getNext();

            if(stepOne == stepTwo) {
                return true;
            }
        }

        return false;

    }

    private LinkedList<Integer> getLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>(null);
        linkedList.add(new LinkedList.LinkedListNode<>(1));
        LinkedList.LinkedListNode<Integer> node = new LinkedList.LinkedListNode<>(2);
        linkedList.add(node);
        linkedList.add(new LinkedList.LinkedListNode<>(3));
        linkedList.add(new LinkedList.LinkedListNode<>(4));
        linkedList.add(new LinkedList.LinkedListNode<>(5));
        linkedList.add(node);
        return linkedList;
    }

}
