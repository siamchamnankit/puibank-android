package com.example.rockroku.somkiatbankmobilebanking.dao;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rockroku on 8/31/16.
 */

public class AccountDao {
    @SerializedName("AccNo")
    private String accountNumber;

    @SerializedName("Name")
    private String name;

    @SerializedName("amount")
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
