import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //degiskenleri olustur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //scanner sınıfı tanımlama
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan degerleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.print("ortalamanız : " + sonuc);

        String kosul = (sonuc >= 60 ) ? "gectiniz" : "kaldınız";
        System.out.print(kosul);

    }
}