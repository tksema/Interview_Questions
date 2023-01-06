package Question03;

public class ReverseString {
    public static void main(String[] args) {
        //1. Yol

        String str = "Hersey guzel olacak";
        System.out.println("String ile duz yazilimi : " + str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);

        System.out.println("StringBuilder ile tersten : " + sb.reverse());

        //2.Yol
        System.out.print("2.Yol : ");
        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i));

        }


        System.out.println("***");

        terstenYazdirma(str);

    }

    private static void terstenYazdirma(String str) {
        char[] kelime = str.toCharArray();
        System.out.print("method kullanarak : ");
        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(kelime[i]);
        }


    }


}