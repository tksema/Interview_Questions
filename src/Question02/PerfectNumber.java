package Question02;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PerfectNumber {
 /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.print("bir sayi giriniz :");
     int girilenSayi = scan.nextInt();
     perfectNumber(girilenSayi);

 }
    private static void perfectNumber(int girilenSayi) {
        IntStream.range(1, girilenSayi)
                .filter(n -> tamBolenler(n).sum() == n)
                .forEach(n -> System.out.println(n + " mükemmel sayıdır ve tam bölenleri şunlardır: "
                        + tamBolenler(n).mapToObj(Integer::toString).collect(Collectors.joining(" "))));
    }

    private static IntStream tamBolenler(int n) {
        return IntStream.range(1, n).filter(d -> n % d == 0);
    }


}
