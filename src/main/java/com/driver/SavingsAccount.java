package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double minBalance) {
        super(name, balance, minBalance);
    }

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        // minimum balance is 0 by default
super(name, balance);
this.maxWithdrawalLimit=maxWithdrawalLimit;
this.rate=rate;
    }
    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
if(amount>maxWithdrawalLimit) {
    throw new Exception("Maximum Withdraw Limit Exceed");
}
else if(amount>getBalance()){
    throw new Exception("Insufficient Balance");
}
else{
    double balance = getBalance();
    balance-=amount;
    setBalance(balance);
}
    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
double SI=0;
double balance=getBalance();
return SI=(balance*rate*years)/100;
    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
        int n = times * years;
        double balance=getBalance();
        double finalAmount = balance * Math.pow(1 + rate / times, n);

        return finalAmount;
    }
}
