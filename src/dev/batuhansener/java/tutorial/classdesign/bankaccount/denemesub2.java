package dev.batuhansener.java.tutorial.classdesign.bankaccount;

public class denemesub2 implements denemeInterface {

    @Override
    public double act(double balance, double amount){
        balance += amount;
        return balance;
    }
}
