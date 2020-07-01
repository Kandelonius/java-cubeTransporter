package bankaccount;

public class VIPCustomer
{
    private String name;
    private double creditLimit;
    private String email;

    public VIPCustomer()
    {
        this("default name", 125_000, "default email");
    }

    public VIPCustomer(
        String name,
        String email)
    {
        this("VIP name",150_000, "VIP email");
    }

    public VIPCustomer(
        String name,
        double creditLimit,
        String email)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public double getCreditLimit()
    {
        return creditLimit;
    }

    public String getEmail()
    {
        return email;
    }

    @Override
    public String toString()
    {
        return "VIPCustomer{" +
            "name='" + name + '\'' +
            ", creditLimit=" + creditLimit +
            ", email='" + email + '\'' +
            '}';
    }
}
