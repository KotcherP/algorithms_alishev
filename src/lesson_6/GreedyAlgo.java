package lesson_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class GreedyAlgo {
    public static void main(String[] args) {
        int[] arr = {3,1,7,9,9,5};
        System.out.println(maxNumberFromDigits(arr));
    }

    public static String maxNumberFromDigits(int[] arr){

        return String.join("",Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));


    }
}


