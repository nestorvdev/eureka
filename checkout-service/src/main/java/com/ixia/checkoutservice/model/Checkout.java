package com.ixia.checkoutservice.model;

import java.util.List;

public class Checkout {
    private String id,url,totalAmount;
    private List<String> availableMethods;

    public Checkout(){}

    public Checkout(String id) {
        this.id = id;
    }

    public Checkout(String id, String url, String totalAmount, List<String> availableMethods) {
        super();
        this.id = id;
        this.url = url;
        this.totalAmount = totalAmount;
        this.availableMethods = availableMethods;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getUrl() {return url;}
    public void setUrl(String url) {this.url = url;}
    public String getTotalAmount() {return totalAmount;}
    public void setTotalAmount(String totalAmount) {this.totalAmount = totalAmount;}
    public List<String> getAvailableMethods() {return availableMethods;}
    public void setAvailableMethods(List<String> availableMethods) {this.availableMethods = availableMethods;}
}
