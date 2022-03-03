package com.itacademy.java.oop.basics;

import java.time.LocalDate;
import java.util.ArrayList;

public class LoansApplication {
    public static void main(String[] args) {

        Customer customer = new Customer("Tomas", "Tomaitis", 41, 380111111);

        Loan loan1 = new Loan(123123, 3000, LoanType.CONSUMER_LOAN, LocalDate.parse("2025-03-23"));
        Loan loan2 = new Loan(321321, 25000, LoanType.LEASING, LocalDate.parse("2028-03-23"));

        Loan[] customerLoans = new Loan[]{loan1, loan2};
        customer.setCustomerLoans(customerLoans);
        customer.printLoanInfo();


    }


}
