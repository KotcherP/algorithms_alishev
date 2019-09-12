package lesson_2;

import java.io.IOException;
import java.util.Arrays;

public class Fibo_memo {
    public static void main(String[] args) throws IOException {

        int n = 100;
        long[] mem = new long[n+1];

        Arrays.fill(mem,-1);

//        System.out.println(fib(3));
//        System.out.println(fib(5));
       // System.out.println(fib(n,mem));
        System.out.println(Math.log(67));
    }

    //0 1 1 2 3 5
    public static long fib(int n,long[] mem){

        if(mem[n] != -1)
            return mem[n];

        if(n <= 1)
            return n;

        long res = fib(n-1,mem) + fib(n-2,mem);
        mem[n] = res;
        return res;
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
