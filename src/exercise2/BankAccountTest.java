package exercise2;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount newBankAccount = new BankAccount("00000001");


        BankAccount ArtemSavings = new BankAccount(1000, 0.10);
        ArtemSavings.withdraw(250);
        ArtemSavings.deposit(400);
        ArtemSavings.addInterest();
        System.out.println("The new Balance is:" + ArtemSavings.getBalanceNew());
        System.out.println("Expected: 1265.0");



        System.out.printf("%n");


        //Prompt the user for an information
        System.out.printf("Please enter user's account number: ");
        String accountNumber = input.nextLine();
        newBankAccount.setAccountNumber(accountNumber);
        System.out.println();

        System.out.printf("Please enter the user's name: ");
        String ownersName = input.nextLine();
        newBankAccount.setOwnersName(ownersName);
        System.out.println();

        System.out.printf("Please enter user's account balance: ");
        String balance = input.nextLine();
        newBankAccount.setBalance(balance);
        System.out.println();

        //Display the patient information
        System.out.printf("The user's account number: %s%n", newBankAccount.getAccountNumber());
        System.out.printf("The user's name: %s%n", newBankAccount.getOwnersName());
        System.out.printf("The user's account balance: %s%n", newBankAccount.getBalance());

    }
}
