package com.evaluation;

import java.util.Arrays;

import com.util.LinkedList;

public class SumLists {

    public static void main(String[] args) {
        new SumLists().go();
    }

    private void go() {

        LinkedList<Integer> listA = LinkedList.fill(Arrays.asList(7,1,6));
        LinkedList<Integer> listB = LinkedList.fill(Arrays.asList(5,9,2));

        System.out.println(sumLists(listA, listB));
    }

    private LinkedList<Integer> sumLists(LinkedList<Integer> listA, LinkedList<Integer> listB) {

        int a = getListSum(listA);
        int b = getListSum(listB);

        return getNumberAsList(a+b);
    }

    private LinkedList<Integer> getNumberAsList(int val) {

        int number = val;
        int digit = number % 10;

        LinkedList<Integer> linkedList = new LinkedList<>(null);

        while(number > 0) {
            linkedList.add(new LinkedList.LinkedListNode<>(digit));
            number /= 10;
            digit = number % 10;
        }

        return linkedList;

    }

    private int getListSum(LinkedList<Integer> list) {
        LinkedList.LinkedListNode<Integer> node = list.getHead();
        int sum = node.getObject();
        node = node.getNext();

        int i  = 1;

        while (node != null) {
            Integer v = node.getObject();
            sum = (v * (int) Math.pow(10, i)) + sum;
            node = node.getNext();
            i++;
        }

        return sum;
    }
}
