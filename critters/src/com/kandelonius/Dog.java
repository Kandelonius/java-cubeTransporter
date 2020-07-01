package com.kandelonius;

import java.sql.SQLOutput;

public class Dog extends Animal
{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog
        (
        String name,

        int size,
        int wieght,
        int eyes,
        int legs,
        int tail,
        int teeth,
        String coat
    )
    {
        super
            (
            name,
            1,
            1,
            size,
            wieght
            );
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew()
    {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat()
    {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}
