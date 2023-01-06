package Question03;

public class ReverseString {
    public static void main(String[] args) {
        //1. Yol

        String str = "Hersey guzel olacak";
        System.out.println("String ile duz yazilimi : " + str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);

        System.out.println("StringBuilder ile tersten : " + sb.reverse());


    }

}