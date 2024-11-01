package com.zelling.models;

import com.google.gson.annotations.SerializedName;

public class NestedExchangeApiResponse {
    @SerializedName("USD")
    private float usd;
    @SerializedName("BRL")
    private float brl;
}
