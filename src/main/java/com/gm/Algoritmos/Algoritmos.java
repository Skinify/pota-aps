package com.gm.Algoritmos;

import com.gm.Algoritmos.Interface.ISort;

public class Algoritmos {
    public ISort mergeSort, quickSort, bubbleSort, selectionSort, insertionSort, heapSort, countSort, bucketSort, radixSort;

    public Algoritmos(){
        mergeSort = new AlgoritmoMergeSort();
        quickSort = new AlgoritmoQuickSort();
        bubbleSort = new AlgoritmoBubbleSort();
        selectionSort = new AlgoritmoSelectionSort();
        insertionSort = new AlgoritmoInsertionSort();
        heapSort = new AlgoritmoHeapSort();
        countSort = new AlgoritmoCountSort();
        bucketSort = new AlgoritmoBucketSort();
        radixSort = new AlgoritmoRadixSort();
    }
}
