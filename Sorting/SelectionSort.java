package DataStructure.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
       int arr[] = {1,4,2,3,5,6,8,7,9,11,10,0,15,14,13,12};
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    min = j;
                }
            }
            if (i != min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

//        int arr[]  = {1,5,50,49,48,3,132,36,6,55,45,21,2,16,616,166,46,16166,0};
//        for (int i = 0; i < arr.length-1; i++) {
//            int min = i;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] > arr[j]){
//                    min = j;
//                }
//            }
//            if (i != min){
//                int temp = arr[i];
//                arr[i] = arr[min];
//                arr[min] = temp;
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
     }
}
