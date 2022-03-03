package com.itacademy.java.oop.basics;

public class Customer {
    private String name, surname;
    private int age;
    private long personalId;
    private Loan[] customerLoans;


    public Customer(String name, String surname, int age, long personalId) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalId = personalId;
    }

    public Customer() {
    }


    public void printCustomerLoanInformation() {
        for (Loan loan : customerLoans) {
            System.out.println(". Amount: " + loan.getAmount() + ", type: " + loan.getLoanType() + ", ID: "+ loan.getId() + ", until date: " + loan.getTerminationDate());
        }

    }


    public void printLoanInfo() {
        float totalAmount = 0;
        for (Loan loan : customerLoans) {
            totalAmount += loan.getAmount();
        }
        System.out.println("Customer " + getName() + " " + getSurname() + ", id no " + getPersonalId() + ", has " + customerLoans.length + " loans with total amount of " + totalAmount);
        printCustomerLoanInformation();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPersonalId() {
        return personalId;
    }

    public void setPersonalId(long personalId) {
        this.personalId = personalId;
    }

    public Loan[] getCustomerLoans() {
        return customerLoans;
    }

    public void setCustomerLoans(Loan[] customerLoans) {
        this.customerLoans = customerLoans;
    }
}
