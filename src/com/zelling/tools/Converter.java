package com.zelling.tools;


import com.zelling.models.Currency;
import com.zelling.models.ExchangeApiResponse;

public class Converter {
    private int option;
    private double amount;

    public double convert(int option, double amount){
        var apiSearch = new ExchangeApiSearch();
        var converter = new Converter();
        var apiResult = new ExchangeApiResponse();
        var conversionRate = new Currency();
        double result;


        switch (option){
            case 1:
                apiResult = apiSearch.search("USD");
                conversionRate = apiResult.getNestedExchangeApiResponse().getArs();
                return amount * conversionRate.getValue();
            case 2:
                apiResult = apiSearch.search("ARS");
                conversionRate = apiResult.getNestedExchangeApiResponse().getUsd();
                return amount * conversionRate.getValue();
            case 3:
                apiResult = apiSearch.search("USD");
                conversionRate = apiResult.getNestedExchangeApiResponse().getBrl();
                return amount * conversionRate.getValue();
            case 4:
                apiResult = apiSearch.search("BRL");
                conversionRate = apiResult.getNestedExchangeApiResponse().getUsd();
                return amount * conversionRate.getValue();
            case 5:
                apiResult = apiSearch.search("USD");
                conversionRate = apiResult.getNestedExchangeApiResponse().getCop();
                return amount * conversionRate.getValue();
            case 6:
                apiResult = apiSearch.search("COP");
                conversionRate = apiResult.getNestedExchangeApiResponse().getUsd();
                return amount * conversionRate.getValue();
            default:
                return -1;
        }

    }
}
