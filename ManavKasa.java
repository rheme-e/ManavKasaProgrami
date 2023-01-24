package Giris;
import java.util.Scanner;
import java.text.DecimalFormat;
public class ManavKasa {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican;
        double armutunkilosu,elmaninkilosu,domatesinkilosu,muzunkilosu,patlicaninkilosu;
        armut=2.14;
        elma=3.67;
        domates=1.11;
        muz=0.95;
        patlican=5;
     Scanner inp=new Scanner(System.in);
        System.out.println("Armutun kilosu:");
        armutunkilosu=inp.nextDouble();
        System.out.println("Elmanın kilosu:");
        elmaninkilosu=inp.nextDouble();
        System.out.println("Domatesin kilosu:");
        muzunkilosu=inp.nextDouble();
        System.out.println("Muzun kilosu:");
        domatesinkilosu=inp.nextDouble();
        System.out.println("Patlıcanın kilosu:");
        patlicaninkilosu=inp.nextDouble();
        double sonuc=(armut*armutunkilosu+elma*elmaninkilosu+domates*domatesinkilosu+muz*muzunkilosu+patlican*patlicaninkilosu);
        System.out.println("Toplam Tutar:" + new DecimalFormat("##.##" ).format(sonuc));
    }
}
