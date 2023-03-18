package dev.batuhansener.java.tutorial.classdesign.bankaccount;

public class deneme {
    static double balance = 1200 ,amount = 500;

    public static void main(String[] args) {


        denemeInterface denemeParaYatir = new denemesub2();
        denemeInterface denemeParaCek = new denemesub1();

        System.out.println(balance+" "+amount);

        try {
            changeBalance(denemeParaCek,800);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        try{
//        changeBalance(new denemesub1(),500);
//        }catch (Exception e){
//            e.getMessage();
//        }
    }

    static void changeBalance(denemeInterface denemeInterface, double amount) throws Exception {

        balance = denemeInterface.act(balance,amount);

    }

    static void chanceBalance2(String action, double amount) throws Exception{

        if (amount<0){
            throw new Exception("YANLISSS");
        }

        if (action.equalsIgnoreCase("paraYatir")){
            balance += amount;
        }else if (action.equalsIgnoreCase("paraCek")){
            if (balance>=amount) {
                balance -= amount;
            }else {
                throw new Exception("YAnlısss");
            }
        }
    }

}
