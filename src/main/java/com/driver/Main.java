package com.driver;

public class Main {
    public static void main(String[] args) {

        try {
            // Create a BankAccount object
            BankAccount account = new BankAccount("Alice", 1000.0, 100.0);

            // Display account information
            System.out.println("Account Name: " + account.getName());
            System.out.println("Balance: $" + account.getBalance());

            // Deposit and withdraw money
            account.deposit(500.0);
            System.out.println("New Balance after Deposit: $" + account.getBalance());

            account.withdraw(200.0);
            System.out.println("New Balance after Withdrawal: $" + account.getBalance());

            // Generate account number
            String accountNumber = account.generateAccountNumber(6, 24);
            System.out.println("Generated Account Number: " + accountNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // Create a SavingsAccount object
            SavingsAccount savingsAccount = new SavingsAccount("Bob", 1500.0, 200.0, 5.0);

            // Display account information
            System.out.println("Account Name: " + savingsAccount.getName());
            System.out.println("Balance: $" + savingsAccount.getBalance());

            // Withdraw and calculate interest
            savingsAccount.withdraw(100.0);
            System.out.println("New Balance after Withdrawal: $" + savingsAccount.getBalance());

            int years = 3;
            int times = 4;

            // Calculate simple interest
            double simpleInterest = savingsAccount.getSimpleInterest(years);
            System.out.println("Simple Interest after " + years + " years: $" + simpleInterest);

            // Calculate compound interest
            double compoundInterest = savingsAccount.getCompoundInterest(times, years);
            System.out.println("Compound Interest after " + years + " years (compounded " + times + " times per year): $" + compoundInterest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            // Create a CurrentAccount object
            CurrentAccount currentAccount = new CurrentAccount("Lakshmi chit fund", 8000.0, "TRADE123");

            // Display account information
            System.out.println("Account Name: " + currentAccount.getName());
            System.out.println("Balance: $" + currentAccount.getBalance());
            System.out.println("Trade License ID: " + currentAccount.getTradeLicenseId());

            // Validate trade license ID
            try {
                currentAccount.validateLicenseId();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            //Create a StudentAccount object
            StudentAccount studentAccount = new StudentAccount("John Doe", 500.0, "ABC University");
            System.out.println("Account Name: " + studentAccount.getName());
            System.out.println("Institution Name: " + studentAccount.getInstitutionName());
            System.out.println("Balance: $" + studentAccount.getBalance());

            studentAccount.deposit(100.0);
            System.out.println("New Balance after Deposit: $" + studentAccount.getBalance());

            studentAccount.withdraw(50.0);
            System.out.println("New Balance after Withdrawal: $" + studentAccount.getBalance());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


    }
}