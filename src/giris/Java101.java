package giris;

import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {

        double fiyat,kdvOran, KdvliFiyat, kdvTutar;

        Scanner inp = new Scanner(System.in);
        System.out.println("Fiyat Giriniz: ");
        fiyat = inp.nextDouble();
        kdvOran = fiyat <= 1000 ? 0.18 : 0.8;
        kdvTutar = fiyat * kdvOran ;
        KdvliFiyat = fiyat + kdvTutar;


        System.out.println("KDV'siz Tutar : " + fiyat);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDV'li tutar: " + KdvliFiyat);
    }
}
