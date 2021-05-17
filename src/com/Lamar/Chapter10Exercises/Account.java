package com.Lamar.Chapter10Exercises;

/********************************************************
 *                     Account                           *
 *-------------------------------------------------------*
 * -id: int                                              *
 * -balance: double                                      *
 * -annualInterestRate: double                           *
 * ---------------------------                           *
 * -dateCreated: String                                  *
 * +Account()                                            *
 * +Account(newid: int, newBalance: double)              *
 * +setId(newId: int)                                    *
 * +setBalance(newBalance: double)                       *
 * +setAnnualInterestRate(newAnnualInterestRate: double) *
 * +getId(): int                                         *
 * +getBalance(): double                                 *
 * +getAnnualInterestRate(): double                      *
 * +getDateCreated(): String                             *
 * +getMonthlyInterestRate(): double                     *
 * +getMonthlyInterest(): double                         *
 * +withdraw(amount: double)                             *
 * +deposit(amount: double)                              *
 ********************************************************/



import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

//    Constructors

//    Create a default account

    Account(){
        id=0;
        balance=0;
        annualInterestRate=0;
        dateCreated = new Date();
    }

    Account(int newId, double newBalance){
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return balance + (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }


}
