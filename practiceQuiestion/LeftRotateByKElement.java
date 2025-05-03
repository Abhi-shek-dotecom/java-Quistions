package DataStructure.practiceQuiestion;

import java.util.Arrays;

public class LeftRotateByKElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 3;
        while (k > 0) {
            int rotete = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = rotete;
            k--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
