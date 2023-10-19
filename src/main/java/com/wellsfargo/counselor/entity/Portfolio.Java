package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long portfolioID;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private float riskFactor;

    @Column(nullable = false)
    private long total;

    @JoinColumn(nullable = false, columnName = clientID)
    private Client client;

    protected Porfolio() {

    }

    public Portfolio(String firstName, String lastName, Float riskFactor, long total, Client client) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.riskFactor = riskFactor;
        this.total = total;
        this.client = client;
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(float riskFactor) {
        this.riskFactor = riskFactor;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public void getClientID(Client client){
        this.client = client;
    }
}
