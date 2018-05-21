package exercise2;

import javax.swing.*;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount newBankAccount = new BankAccount("00000001");

        //Base account transaction (example)
        BankAccount ArtemSavings = new BankAccount(1000, 0.10);
        ArtemSavings.withdraw(250);
        ArtemSavings.deposit(400);
        ArtemSavings.addInterest();
        System.out.println("The new Balance is:" + ArtemSavings.getBalanceNew());
        System.out.println("Expected: 1265.0");
        System.out.printf("%n");

        //Prompt the patient for an information
        /*String accountNumber  = JOptionPane.showInputDialog("What is client account number?");
        String ownersName  = JOptionPane.showInputDialog("What is owner name?");
        String balance  = JOptionPane.showInputDialog("What is your balance?");
        String balanceNew  = JOptionPane.showInputDialog("What is patient Address?");
        String interest  = JOptionPane.showInputDialog("What is patient City?");*/


        JTextField accountNumber = new JTextField(5);
        JTextField OwnerName = new JTextField(5);
        JTextField balance = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Account number:"));
        myPanel.add(accountNumber);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Your Name:"));
        myPanel.add(OwnerName);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Your Balance:"));
        myPanel.add(balance);

        /*
        String message = String.format("Information about Client %n Account Number:%s | Client Name:%s " , accountNumber, OwnerName);
        JOptionPane.showMessageDialog(null, message);*/

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter Your Information", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("Account number is: " + accountNumber.getText());
            System.out.println("Client Name is: " + OwnerName.getText());
            System.out.println("Client Balance is: " + balance.getText());

        }



    }
}
