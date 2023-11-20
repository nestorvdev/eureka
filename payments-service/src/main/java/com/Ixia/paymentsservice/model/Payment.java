package com.Ixia.paymentsservice.model;

public class Payment {
    private String id, clientId,ownerId;
    private Float amount;

    public Payment() {
    }

    public Payment(String id, String clientId, String ownerId, Float amount) {
        this.id = id;
        this.clientId = clientId;
        this.ownerId = ownerId;
        this.amount = amount;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getClientId() {return clientId;}
    public void setClientId(String clientId) {this.clientId = clientId;}
    public String getOwnerId() {return ownerId;}
    public void setOwnerId(String ownerId) {this.ownerId = ownerId;}
    public Float getAmount() {return amount;}
    public void setAmount(Float amount) {this.amount = amount;
    }
}
