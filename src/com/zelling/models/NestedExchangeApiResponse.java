package com.zelling.models;

import com.google.gson.annotations.SerializedName;

public class NestedExchangeApiResponse {
    @SerializedName("USD")
    private float usd;
    @SerializedName("BRL")
    private float brl;
    @SerializedName("ARS")
    private float ars;
    @SerializedName("BOB")
    private float bob;
    @SerializedName("CLP")
    private float clp;
    @SerializedName("COP")
    private float cop;

    public float getUsd(){
        return usd;
    }

    public float getBrl(){
        return brl;
    }

    public float getArs() {
        return ars;
    }

    public float getBob() {
        return bob;
    }

    public float getClp() {
        return clp;
    }

    public float getCop() {
        return cop;
    }
}
