package com.driver;

public class StudentAccount extends BankAccount{

    String  institutionName;

    public StudentAccount(String name, double balance, String  institutionName) {
        //minimum balance is 0 by default
super(name, balance);
this.institutionName=institutionName;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public void deposit(double amount){
        double balance=getBalance();
        balance+=amount;
        setBalance(balance);
    }
    public void withdraw(double amount){
        if(amount>getBalance()){
            System.out.print("Insufficient balance");
        }
        double balance=getBalance();
        balance-=amount;
        setBalance(balance);
    }
}
