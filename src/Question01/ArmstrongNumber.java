package Question01;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArmstrongNumber {

        /*
         * Java 8 / Lambda approach to generate Armstrong number.
         * Armstrong always start to look from number 1.
         * @param series Number of how many Armstrong number should be generated
         * @return List holding resulting Armstrong number.
         */
        public static List<Integer> sayilar(int sayi) {
            //  List<Integer> sayil=new ArrayList<>(Arrays.asList())

            return Stream.iterate(1, i -> ++i)// sayiyi stringe cevirdigimiz icin intStream kullanamayiz
                    .filter(i -> i == Stream.of(String.valueOf(i).split(""))
                            .map(Integer::valueOf)// string olan sayiyi intiger'a donusturuyor
                            .map(n -> (n*n*n))
                            .mapToInt(n -> n)
                            .sum())
                    .limit(sayi)
                    .collect(toList());
        }
    }

