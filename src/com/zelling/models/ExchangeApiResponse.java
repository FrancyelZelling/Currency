package com.zelling.models;

import com.google.gson.annotations.SerializedName;

public class ExchangeApiResponse {
    @SerializedName("result")
    private String result;
    @SerializedName("base_code")
    private String baseCode;
    @SerializedName("conversion_rates")
    private NestedExchangeApiResponse nested;

    public String getResult(){
        return result;
    }

    public String getBaseCode(){
        return baseCode;
    }

    public NestedExchangeApiResponse getNestedExchangeApiResponse(){
        return nested;
    }
}
