package com.gm.Enums;

import java.util.Random;

public enum TamanhoVetorEnum {
    D5,
    D10,
    D50,
    D100,
    D1000,
    D10000;

    public TamanhoVetorEnum PegarTamanhoAleatorio(){
        return TamanhoVetorEnum.values()[new Random().nextInt(TamanhoVetorEnum.values().length)];
    }
}
