package com.zelling.models;

import com.google.gson.annotations.SerializedName;

public class NestedExchangeApiResponse {
    @SerializedName("USD")
    private float usd;
    @SerializedName("BRL")
    private float brl;

    public float getUsd(){
        return usd;
    }

    public float getBrl(){
        return brl;
    }
}
