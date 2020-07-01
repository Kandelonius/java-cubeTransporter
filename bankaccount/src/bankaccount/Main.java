package bankaccount;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("I run");

        BankAccount shanesAccount = new BankAccount(15_000.00, "Shane", "someEmail@email.com", "999-111-555");
        shanesAccount.withdrawal(5.0);
        shanesAccount.deposit(13.37);
        System.out.println(shanesAccount.toString());

        VIPCustomer sebastiansAccount = new VIPCustomer();
        System.out.println(sebastiansAccount.toString());
        VIPCustomer seansAccount = new VIPCustomer("Sean", "email");
        System.out.println(seansAccount.toString());
        VIPCustomer stansAccount = new VIPCustomer("Stan", 1_500_000, "email");
        System.out.println(stansAccount.toString());
    }
}
