package DataStructure;

import java.util.Scanner;

public class FibonacciSeries {
    public static void printFib(int a, int b, int n){
        if (n==0)return;
        int c = a+b;
        System.out.println(c);
//        a = b;
//        b = c;
//        printFib(a,b,n-1);
        printFib(b,c,n-1);
        return;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        printFib(a,b,n-2);
    }
}
