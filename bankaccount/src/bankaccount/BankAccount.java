package bankaccount;

public class BankAccount
{
    // account number, balance, name, email, phone
    private static int maxAccountNumber = 0;

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount()
    {
        this(2.50,
            "Default name",
            "Default address",
            "Default phone");
    }

    public BankAccount(
        double balance,
        String name,
        String email,
        String phone)
    {
        maxAccountNumber++;
        this.accountNumber = maxAccountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount(
        String name,
        String email,
        String phone)
    {
        this(100.55, "customerName", "customerEmail", "666-333-1234");
    }

    public void deposit(double depositAmount)
    {
        this.balance += depositAmount;
        System.out.println("Added "+depositAmount+" to account for "+name);
        System.out.println(updateStatus());
    }
    public void withdrawal(double withdrawalAmount)
    {
        if(balance - withdrawalAmount < 0)
        {
            System.out.println("Only "+balance+" available. Withdrawal not processed");
        } else
        {
            this.balance -= withdrawalAmount;
            System.out.println("Processed withdrawal of  "+withdrawalAmount+" from account for "+name);
            System.out.println(updateStatus());
        }
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    // Methods
    // increments the balance field
    public String updateStatus()
    {
        return "Balance for "+this.getName()+" is "+this.getBalance();
    }

    @Override
    public String toString()
    {
        return "BankAccount{" +
            "accountNumber=" + accountNumber +
            ", balance=" + balance +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", phone='" + phone + '\'' +
            '}';
    }
}
