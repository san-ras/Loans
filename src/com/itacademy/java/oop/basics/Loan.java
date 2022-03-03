package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class Loan {
    private int id;
    private float amount;
    private LoanType loanType;
    private LocalDate terminationDate;


    public Loan(int id, float amount, LoanType loanType, LocalDate terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    public Loan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public LocalDate getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(LocalDate terminationDate) {
        this.terminationDate = terminationDate;
    }
}


