package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Export {
    private double customsValueSum;
    private String customsValueCurrency;

    public double getCustomsValueSum() {
        return customsValueSum;
    }

    public void setCustomsValueSum(double customsValueSum) {
        this.customsValueSum = customsValueSum;
    }

    public String getCustomsValueCurrency() {
        return customsValueCurrency;
    }

    public void setCustomsValueCurrency(String customsValueCurrency) {
        this.customsValueCurrency = customsValueCurrency;
    }
}
