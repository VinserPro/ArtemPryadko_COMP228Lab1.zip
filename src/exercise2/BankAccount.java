package exercise2;

public class BankAccount {
    private String accountNumber;
    private String ownersName;
    private String balance;
    private double balanceNew;
    private double interest;

    public BankAccount()
    {
        balanceNew = 0;
        interest = 0;
    }

    public BankAccount(double initialBalance, double initialInterest)
    {
        balanceNew = initialBalance;
        interest = initialInterest;
    }

    public void deposit(double amount)
    {
        balanceNew = balanceNew + amount;
    }

    public void withdraw(double amount)
    {
        balanceNew = balanceNew - amount;
    }

    public void addInterest()
    {
        balanceNew = balanceNew + balanceNew * interest;
    }

    public double getBalanceNew()
    {
        return balanceNew;
    }

    //Declare a Constructor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    //Allow to user to set information
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setOwnersName(String ownersName)
    {
        this.ownersName = ownersName;
    }
    public void setBalance(String balance)
    {
        this.balance = balance;
    }

    //Allow to user to get information

    public String getAccountNumber()
    {
        return accountNumber;
    }
    public String getOwnersName()
    {
        return ownersName;
    }
    public String getBalance()
    {
        return balance;
    }
}

