package com.gm.Algoritmos;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import com.gm.Algoritmos.Interface.ISort;
import com.gm.Helpers.VetorHelper;

public class AlgoritmoBucketSort implements ISort {
    private void BucketSort(int arr[], int n){
        int max = VetorHelper.Max(arr);
        int min = VetorHelper.Min(arr);
        int numberOfBuckets = max - min + 1;
        List<List<Integer>> buckets = new ArrayList<>(numberOfBuckets);
        for (int i = 0; i < numberOfBuckets; ++i) {
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

    private int Hash(int elem, int min, int numberOfBucket) {
        return (elem - min) / numberOfBucket;
    }

    @Override
    public void Sort(int[] vetor) {
        BucketSort(vetor, vetor.length);
    }
}
