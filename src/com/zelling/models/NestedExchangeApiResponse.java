package com.zelling.models;

import com.google.gson.annotations.SerializedName;

public class NestedExchangeApiResponse {
    @SerializedName("USD")
    private double usd;
    @SerializedName("BRL")
    private double brl;
    @SerializedName("ARS")
    private double ars;
    @SerializedName("BOB")
    private double bob;
    @SerializedName("CLP")
    private double clp;
    @SerializedName("COP")
    private double cop;

    public Currency getUsd(){
        return new Currency("USD", this.usd);
    }

    public Currency getBrl(){
        return new Currency("BRL", this.brl);
    }

    public Currency getArs(){
        return new Currency("Ars", this.ars);
    }

    public Currency getBob(){
        return new Currency("BOB", this.bob);
    }

    public Currency getClp(){
        return new Currency("CLP", this.clp);
    }

    public Currency getCop(){
        return new Currency("BRL", this.cop);
    }
}
