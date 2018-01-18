package com.evaluation;

public class QuickSort {

    public void sort(int[] arr, int low, int high) {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    private int partition(int[] array, int low, int high) {

        int pivot = array[high];
        int i = (low - 1);

        for (int j=low; j<high; j++) {
            if(array[j] <= pivot) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }
}
