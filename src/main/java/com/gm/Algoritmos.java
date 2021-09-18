package com.gm;

public class Algoritmos {
    
    public Algoritmos(){
        
    }

    public void MergeSort(int vetor[], int[] aux, int ini, int fim){
        if(ini < fim){
            int meio = (ini + fim) / 2;
            MergeSort(vetor, aux, ini, meio);
            MergeSort(vetor, aux, meio + 1, fim);
            Intercalar(vetor, aux, ini, meio, fim);
        }
    }

    private void Intercalar(int[] vetor, int[] aux, int ini, int meio, int fim) {
        for(int k = ini; k <= fim; k++){
            aux[k] = vetor[k];
        }

        int i = ini;
        int j = meio + 1;

        for(int k = ini; k <= fim; k++){
            if(i > meio) vetor[k] = aux[j++];
            else if( j > fim) vetor[k] = aux[i++];
            else if(aux[i] < aux[j]) vetor[k] = aux[i++];
            else vetor[k] = aux[j++];
        }
    }
    
    public void QuickSort(int [] vetor, int inicio, int fim){
            if(inicio < fim){
                int p = Partition(vetor, inicio, fim);
                QuickSort(vetor, inicio, p-1);
                QuickSort(vetor, p+1, fim);
            }
    }

    private int Partition(int[] vetor, int inicio, int fim) {
        int pivot = vetor[fim];
        int i = inicio;
        for(int j = inicio; j < fim; j++){
            if(vetor[j] < pivot){
                int aux = vetor[j];
                vetor[j] = vetor[i];
                vetor[i] = aux;
                i++;
            }
        }

        int aux = vetor[i];
        vetor[i] = vetor[fim];
        vetor[fim] = aux;
        return i;
    }

}
