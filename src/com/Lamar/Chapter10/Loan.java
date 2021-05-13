package com.Lamar.Chapter10;

//-loanDate: java.util.Date
//        +Loan()
//        +Loan(annualInterestRate: double, numberOfYears: int, loanAmount: double)
//        +getAnnualInterestRate(): double
//        +getNumberOfYears(): int
//        +getLoanAmount(): double
//        +getLoanDate(): java.util.Date
//        +setAnnualInterestRate(annualInterestRate: double): void
//        +setNumberOfYears(numberOfYears: int): void
//        +setLoanAmount(loanAmount: double): void
//        +getMonthlyPayment(): double



public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

//    no arg constructor
    public loan(){
        this(2,5,1,1000);
    }

//    Construct a loan with a specific annual interest rate, number of years, and loan amount

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears =  numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

//    Return annualInterestRate

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

//    set a new annnualInterestRate
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }





}
