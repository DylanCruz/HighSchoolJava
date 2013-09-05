import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
/**
 * iz the bank account but with array list nao.
 * 
 * @author Dylan Cruz
 * @version 1.0 (1/19/12)
 */
public class bankArray
{
    public void main(String [] args) throws FileNotFoundException
    {
        System.out.println("\fStarting Program");
        int menuChoice = 0;
        ArrayList <BankAcct> accts = new ArrayList <BankAcct>();
        readInData(accts);
        
        while(menuChoice != 6)
        {
            menuChoice = menu();
            if(menuChoice == 1)
                enterAccount(accts);
            if(menuChoice == 2)
                findAccount(accts);
            if(menuChoice == 3)
                printAccount(accts);
            if(menuChoice == 4)
                deposit(accts);
            if(menuChoice == 5)
                withdraw(accts);
        }
        writeOutData(accts);
    }
    
    public void readInData(ArrayList <BankAcct> accts) throws FileNotFoundException
    {
        System.out.println("Read in data successful.");
        File aFile = new File("F:\\myAccounts.txt");
        Scanner scan = new Scanner(new FileReader(aFile));
        String n;
        double b;
        while(scan.hasNext())
        {
            n = scan.next();
            b = scan.nextDouble();
            BankAcct data = new BankAcct(n, b);
            accts.add(data);
        }
        scan.close();
    }
    
    public void writeOutData(ArrayList <BankAcct> accts) throws FileNotFoundException
    {
        String str = "";
        for(int i = 0; i < accts.size(); i++)
            str += accts.get(i).toString();
        try
        {
            File aFile = new File("F:\\myAccounts.txt");
            FileWriter out = new FileWriter(aFile);
            try
            {
                out.write(str);
            }
            finally
            {
            }
            out.close();
        }
        catch(IOException e){};
        System.out.println("Write out data successful.");
        System.out.println("You may now close the program.");
    }
    
    public int menu()
    {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        System.out.println("***** Simpleton's Bank *****");
        System.out.println("1. Add an account.");
        System.out.println("2. Find an account.");
        System.out.println("3. Print out all accounts.");
        System.out.println("4. Deposit money.");
        System.out.println("5. Withdraw money.");
        System.out.println("6. Exit program.");
        choice = scan.nextInt();
        System.out.println("****************************");
        return choice;
    }
    
    public void withdraw(ArrayList <BankAcct> accts)
    {
        BankAcct c;
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the account name you wish to withdraw money from.");
        String l = scan.next();
        for(i = 0; i < accts.size(); i++)
        {
            c = accts.get(i);
            if(c.getNam().equals(l))
            {
                double amount;
                System.out.println("Account found. Please enter amount of money to withdraw.");
                amount = scan.nextDouble();
                c.withdrawal(amount);
                return;
            }
        }
        System.out.println("Name not found, no withdraw was made.");
    }
    
    public void deposit(ArrayList <BankAcct> accts)
    {
        BankAcct c;
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the account name you wish to deposit money into.");
        String l = scan.next();
        for(i = 0; i < accts.size(); i++)
        {
            c = accts.get(i);
            if(c.getNam().equals(l))
            {
                double amount;
                System.out.println("Account found. Please enter amount of money to deposit.");
                amount = scan.nextDouble();
                c.deposit(amount);
                return;
            }
        }
        System.out.println("Name not found, no deposit was made.");
    }
    
    /**
     * This method will allow users to enter back accounts into the array list
     * If the user enters done for the name then exit the method
     */
    public void enterAccount(ArrayList <BankAcct> accts)
    {
        String n;
        double b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name. Enter done if you want to exit.");
        n = scan.next();
        
        System.out.println("Please enter your balance.");
        b = scan.nextDouble();
        BankAcct c = new BankAcct(n, b);
        accts.add(c);
    }

    /**
     * This method will allow a user to enter a name and then it will find it in the array,
     * if the name is not in the array it will print out an error message, if the name is
     * in the array then it will output the name and balance.
     */
    public void findAccount(ArrayList <BankAcct> accts)
    {
        BankAcct c;
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter name you wish to find.");
        String l = scan.next();
        for(i = 0; i < accts.size(); i++)
        {
            c = accts.get(i);
            if(c.getNam().equals(l))
            {
                System.out.println(c.toString());
                return;
            }
        }
        System.out.println("Name not found.");
    }

    /**
     * This method will print out all names and their balances.
     */
    public void printAccount(ArrayList <BankAcct> accts)
    {
        for(int x = 0;x < accts.size(); x++)
            System.out.println(accts.get(x));
    }
}
