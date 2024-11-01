package com.zelling.models;

import com.google.gson.annotations.SerializedName;

public class ExchangeApiResponse {
    @SerializedName("result")
    private String result;
    @SerializedName("base_code")
    private String baseCode;
    @SerializedName("conversion_rates")
    private NestedExchangeApiResponse nested;
}
