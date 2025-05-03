package DataStructure.practiceQuiestion;

import java.util.Arrays;

public class LeftRightRotationBy1Element {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int rotete = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = rotete;
        System.out.println(Arrays.toString(arr));
    }
}
