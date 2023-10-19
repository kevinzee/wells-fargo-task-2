package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String riskFactor;

    @Column(nullable = false)
    private String creationDate;

    @ManyToOne()
    @JoinColumn(nullable = false, name = "clientId")
    private Client client;

    protected Portfolio() {

    }

    public Portfolio(String firstName, String lastName, String riskFactor,
            String creationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.riskFactor = riskFactor;
        this.creationDate = creationDate;

    }

    public Long getPortfolioId() {
        return portfolioId;
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

    public void setRiskFactor(String riskFactor) {
        this.riskFactor = riskFactor;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
