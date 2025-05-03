package DataStructure;

import java.util.Scanner;

public class FactorialOfNum {
//    public static void fact(int n){
//        if (n < 0){
//            return;
//        }
//        int factoreal = 1;
//        for (int i = n; i >= 1; i--) {
//         factoreal  = factoreal * i;
//
//        }
//        System.out.println(factoreal);
//        return;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        fact(n);
//    }

   // method = recurson
    public static int fact(int n){
        if (n == 1 || n==0) {
            return 1;
        }
        int f = fact(n-1);
        int factireal = f * n;
        return factireal;
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
       System.out.println(ans);
   }

}
