package com.kandelonius;

public class Animal
{
    private String name;
    private int brain;
    private int body;
    private int size;
    private int wieght;

    public Animal()
    {
    }

    public Animal(
        String name,
        int brain,
        int body,
        int size,
        int wieght)
    {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.wieght = wieght;
    }

    public void eat()
    {
        System.out.println("Aminal.eat() called");
    }

    public void move()
    {

    }

    public String getName()
    {
        return name;
    }

    public int getBrain()
    {
        return brain;
    }

    public int getBody()
    {
        return body;
    }

    public int getSize()
    {
        return size;
    }

    public int getWieght()
    {
        return wieght;
    }
}
