package Question04;

import java.util.Scanner;

public class Swap {

    //İki sayinin yerlerini degistiren bir Java programi yaziniz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen degistirilecek iki sayi giriniz");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();

        System.out.println("Swap'tan once: " + n1 + " - " + n2);


        //1.Yol: 3. bir variable kullanalim
        double temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("Swap'tan sonra: " + n1 + " - " + n2);


        //2.Yol: 3.bir variable kullanmadan
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("Swap'tan sonra: " + n1 + " - " + n2);


    }
}
