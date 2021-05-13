package com.Lamar.Chapter10;


import java.util.Scanner;

public class LoanTest {
    public static void main(String[] args) {
//        Scanner
        Scanner input = new Scanner(System.in);

//        Enter yearly interest rate
        System.out.println("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        //        enter number of years

        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        //        enter loan amount

        System.out.println("Enter loan amount, for example, 120000.95");
        double loanAmount = input.nextDouble();

        //        create Loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);



//        display loan date, monthly payment and total payment
        System.out.printf("The loan was created on %s\n" +
                        "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                loan.getTotalPayment());


    }


}
