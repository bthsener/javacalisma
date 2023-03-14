package dev.batuhansener.java.tutorial.exeptions.odev;

public class Secretary extends Employee{

    public Secretary(String ad, int year) {
        super(ad, year);
    }

    static public void paidSalary(Employee employee){
        try {
            isOverLimit(employee);
            System.out.println(employee.ad+"'ın maasi elden ödendi");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static private void isOverLimit(Employee employee) throws Exception{
        if (employee.getSalary()>10000){
            throw new SalaryPaidOnBankException("Bu 10000 limitinden fazla banka ile yollamalısınız!");
        }
    }
}
