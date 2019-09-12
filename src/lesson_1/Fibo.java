package lesson_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibo {
    public static void main(String[] args) throws IOException {

//        System.out.println(fib(3));
//        System.out.println(fib(5));
        System.out.println(fibEffective(100));
    }

    //0 1 1 2 3 5
    public static long fib(int n){
        if(n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static long fibEffective(int n){

        long[] arr = new long[n+1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];

    }
}
