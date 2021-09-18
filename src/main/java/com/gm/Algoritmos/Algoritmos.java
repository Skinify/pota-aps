package com.gm.Algoritmos;

import com.gm.Algoritmos.Interface.ISort;

public class Algoritmos {
    public ISort mergeSort;
    public ISort quickSort;

    public Algoritmos(){
        mergeSort = new AlgoritmoMergeSort();
        quickSort = new AlgoritmoQuickSort();
    }
}
