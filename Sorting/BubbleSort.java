package DataStructure.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//         int arr[] = {1,8,7,6,5,9,11,10};
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-1-i; j++) {
//                if (arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        int arr1[] = {1,8,7,6,5,9,11,10,8,5,2,3,1,0};
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = 0; j < arr1.length-1-i; j++) {
                if (arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
