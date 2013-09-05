/**
 * Bank account software for Simpleton's Bank.
 * 
 * @author Dylan Cruz - Intern
 * @version 1.0 11/15/11
 */
public class BankAcct
{
    // instance variables - replace the example below with your own
    private String name;
    private double balance;

    /**
     * Constructors for objects of class BankAcct
     */
    public BankAcct()
    {
        balance = 0;
        name = "Name";
    }
    public BankAcct(String newName, double startVal)
    {
        name = newName;
        balance = startVal;
    }
    
    /**
     * Accessors for tester.
     */
    public String getNam()
    {
        return name;
    }
    public double getBal()
    {
        return balance;    
    }

    /**
     * Allows depositing of money into an account.
     */
    public void deposit(double dep)
    {
        balance = balance + dep;
    }

    /**
     * Gets the current balance of the account.
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * Gets the name on the account.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Allows for setting a new name to the account.
     */
    public void setName(String newName)
    {
        name = newName;
    }

    /**
     * Transfers money from one persons account to another.
     */
    public void transfer(BankAcct to, double howMuch)
    {
        if(howMuch > balance)
            System.out.println("You don't have enough money to transfer this amount.");
        else
        {
            this.withdrawal(howMuch);
            to.deposit(howMuch);
        }
    }

    /**
     * 
     */
    public void withdrawal(double with)
    {
        if(with <= balance)
            balance = balance - with;
        else
            System.out.println("You don't have enough money to withdraw that much.");
    }

    }
