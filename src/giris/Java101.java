package giris;

import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {

        int mat, turkce, muzık, fen;

        Scanner inp = new Scanner(System.in);

        System.out.println("Mat Notunuz: ");
        mat = inp.nextInt();

        System.out.println("Turkce Notunuz: " );
        turkce = inp.nextInt();

        System.out.println("Muzık Notunuz: ");
        muzık = inp.nextInt();

        System.out.println("Fen Notunuz: ");
        fen = inp.nextInt();

        int topla = (mat + turkce + muzık + fen);
        double sonuc = topla / 4;
        System.out.print("Ortalamanız : " +sonuc);
        System.out.println(sonuc > 60 ? "tebrikler, sınıfı geçtiniz" : "üzgünüm, sınıfta kaldınız");
    }
}
