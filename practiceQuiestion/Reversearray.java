package DataStructure.practiceQuiestion;

import java.util.Arrays;

public class Reversearray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,78,9,10};
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
