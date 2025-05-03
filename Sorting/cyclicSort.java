package DataStructure.Sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int []arr = {2,1,5,4,3,8,6,9,10,7};
        int i = 0;
        while (i <= arr.length-1){
            int cIndex = arr[i]-1;
            if (arr[i] != arr[cIndex]){
                int temp = arr[i];
                arr[i] = arr[cIndex];
                arr[cIndex] = temp;
            }else {
                i++;
            }
        }
       System.out.println(Arrays.toString(arr));
//        for (int j = 0; j < arr.length; j++) {
//            System.out.println(arr[j] + " ");
//        }
    }
}
