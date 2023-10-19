package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Securities {

    @Id
    @GeneratedValue()
    private long secID;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private float quantity;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private long total;

    @Column(nullable = false)
    private String purchaseDate;

    @JoinColumn(nullable = false, columnName = portfolioID)
    private Portfolio portfolio;
    
    protected Securities() {

    }

    public Securities(String symbol, String type, float quantity, float price, long total, String purchaseDate, Portfolio portfolio) {
        this.sybol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.purchaseDate = purchaseDate;
    }

    public Long getSecurityID() {
        return securityID;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public void getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    public void getPortfolioID(Portfolio portfolio){
        this.portfolio = portfolio;
    }
}
