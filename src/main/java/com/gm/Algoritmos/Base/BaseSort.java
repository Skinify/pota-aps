package com.gm.Algoritmos.Base;

import com.gm.Algoritmos.Interface.ISort;

public abstract class BaseSort implements ISort{
    private int _compCont;

    public int GetCompCont(){
        int aux = _compCont;
        _compCont = 0;
        return aux;
    }

    public boolean Maior(int a, int b){
        _compCont++;
        return a > b;
    }

    public boolean MaiorIgual(int a, int b){
        _compCont++;
        return a >= b;
    }

    public boolean Menor(int a, int b){
        _compCont++;
        return a < b;
    }

    public boolean MenorIgual(int a, int b){
        return a <= b;
    }
}
