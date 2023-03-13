package dev.batuhansener.java.tutorial.exeptions;

import java.util.HashMap;
import java.util.Map;

public class TcknExeption {

    static Map<Integer, String> kisi = new HashMap<>();

    public static void main(String[] args) {

        tcknAra(2);
        tcknAra(5);
        tcknKayit(2,"Batuhan");
        tcknKayit(5,"Sener");
        tcknAra(2);

    }

    static void tcknAra(int tckn){
        RuntimeException tcnkYok = new RuntimeException("Sistemde böyle bir TCKN yok.");

        if (!(kisi.get(tckn) == null)){
            System.out.println("İlgili kişi: "+kisi.get(tckn));
        }else{
            try {
                throw tcnkYok;
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }

    static void tcknKayit(int tckn, String isim) throws RuntimeException{
        RuntimeException tcnkVar = new RuntimeException("Sistemde böyle bir TCKN kayıtlı.");

        if ((kisi.get(tckn) == null)){
            kisi.put(tckn, isim);
            System.out.println(tckn+" "+isim+" kayit edildi");
        }else{
            try {
                throw tcnkVar;
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
