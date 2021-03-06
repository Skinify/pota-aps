package com.gm.Algoritmos;

import java.util.Arrays;
import com.gm.Algoritmos.Base.BaseSort;

public class AlgoritmoRadixSort extends BaseSort{
    private void ModifiedCountSort(int arr[], int n, int exp){
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        for (i = 0; Menor(i, n); i++)
            count[(arr[i] / exp) % 10]++;
 
        for (i = 1; Menor(i, 10); i++)
            count[i] += count[i - 1];
 
        for (i = n - 1; MaiorIgual(i, 0); i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; Menor(i, n); i++)
            arr[i] = output[i];
    }

    private void RadixSort(int[] vetor, int n){
        int m = Max(vetor);
        for (int exp = 1; Maior(m / exp, 0); exp *= 10)
            ModifiedCountSort(vetor, n, exp);
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
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    @Override
    public void Sort(int[] vetor) {
        RadixSort(vetor, vetor.length);
    }
}
