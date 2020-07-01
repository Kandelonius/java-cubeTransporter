package bankaccount;


public class Main
{
    public static void main(String[] args)
    {
        System.out.println("I run");

        BankAccount shanesAccount = new BankAccount(15_000.00, "Shane", "someEmail@email.com", "999-111-555");
        shanesAccount.withdrawal(5.0);
        shanesAccount.deposit(13.37);
        System.out.println(shanesAccount.toString());
    }
}
