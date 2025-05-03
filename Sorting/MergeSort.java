package DataStructure.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int arr[], int s, int mid, int e) {
        int temp[] = new int[e - s + 1];
        int i = s, j = mid + 1, k = 0;
        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= e) {
            temp[k++] = arr[j++];
        }
        int p = s;
        for (int l = 0; l < temp.length; l++) {
            arr[p++] = temp[l];
        }
    }

    public static void Divide(int arr[], int s, int e) {
        if (s >= e){
            return;
        }
        int mid = s + (e - s) / 2;
        Divide(arr, s, mid);
        Divide(arr, mid + 1, e);
        merge(arr, s, mid, e);
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 6, 5, 9, 11, 15, 2, 3,10};
        int n = arr.length;
        Divide(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

    }
}
