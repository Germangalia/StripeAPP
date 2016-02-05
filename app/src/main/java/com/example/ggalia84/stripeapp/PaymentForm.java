package com.example.ggalia84.stripeapp;

/**
 * Created by ggalia84 on 5/02/16.
 */
public interface PaymentForm {
    public String getCardNumber();
    public String getCvc();
    public Integer getExpMonth();
    public Integer getExpYear();
    public String getCurrency();
}