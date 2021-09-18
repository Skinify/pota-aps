package com.gm.Algoritmos;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import com.gm.Algoritmos.Base.BaseSort;

public class AlgoritmoBucketSort extends BaseSort {
    private void BucketSort(int arr[], int n){
        int max = Max(arr);
        int min = Min(arr);
        int numberOfBuckets = max - min + 1;
        List<List<Integer>> buckets = new ArrayList<>(numberOfBuckets);
        for (int i = 0; Menor(i, numberOfBuckets); ++i) {
            buckets.add(new ArrayList<Integer>());
        }
        for (int value : arr) {
            int hash = Hash(value, min, numberOfBuckets);
            buckets.get(hash).add(value);
        }
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index++] = value;
            }
        }
    }

    public int Max(int vetor[]){
        int max = vetor[0];
        for (int value : vetor) {
            if (Maior(value, max)) {
                max = value;
            }
        }
        return max;
    }

    public int Min(int vetor[]){
        int min = vetor[0];
        for (int value : vetor) {
            if (Menor(value, min)) {
                min = value;
            }
        }
        return min;
    }

    private int Hash(int elem, int min, int numberOfBucket) {
        return (elem - min) / numberOfBucket;
    }

    @Override
    public void Sort(int[] vetor) {
        BucketSort(vetor, vetor.length);
    }
}
