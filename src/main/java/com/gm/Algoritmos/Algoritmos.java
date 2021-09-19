package com.gm.Algoritmos;

import java.util.ArrayList;
import java.util.List;

import com.gm.Algoritmos.Base.BaseSort;

public class Algoritmos {
    public List<BaseSort> listaDeAlgoritmos = new ArrayList<BaseSort>();

    public Algoritmos(){
        listaDeAlgoritmos.add(new AlgoritmoBubbleSort());
        listaDeAlgoritmos.add(new AlgoritmoSelectionSort());
        listaDeAlgoritmos.add(new AlgoritmoInsertionSort());
        listaDeAlgoritmos.add(new AlgoritmoHeapSort());
        listaDeAlgoritmos.add(new AlgoritmoMergeSort());
        listaDeAlgoritmos.add(new AlgoritmoQuickSort());
        listaDeAlgoritmos.add(new AlgoritmoCountSort());
        listaDeAlgoritmos.add(new AlgoritmoBucketSort());
        listaDeAlgoritmos.add(new AlgoritmoRadixSort());
    }
}
