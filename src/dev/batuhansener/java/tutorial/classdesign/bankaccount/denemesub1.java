package dev.batuhansener.java.tutorial.classdesign.bankaccount;

public class denemesub1 implements denemeInterface{

    @Override
    public double act(double balance, double amount) throws Exception{
        if (balance>=amount)
            balance -= amount;
        else
            throw new Exception("deneme1");


        return balance;
    }
}
