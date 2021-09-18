package com.gm.Algoritmos;

public class Algoritmos {
    private AlgoritmoMergeSort _mergeSort;
    private AlgoritmoQuickSort _quickSort;

    public Algoritmos(){
        _mergeSort = new AlgoritmoMergeSort();
        _quickSort = new AlgoritmoQuickSort();
    }
    
    public void MergeSort(int[] vetor){
        _mergeSort.MergeSort(vetor);
    }

    public void QuickSort(int[] vetor){
        _quickSort.QuickSort(vetor);
    }

}
