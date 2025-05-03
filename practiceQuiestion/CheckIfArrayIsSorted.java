package DataStructure.practiceQuiestion;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,8,9,10};
        int ans = 1;
        for (int i = 0;i < arr.length-1;i++) {
            if (arr[i] < arr[i + 1]) {
                ans++;
            }
        }
        if (ans == arr.length) {
            System.out.println("sorted");
        }else {
            System.out.println("unsorted");
        }
    }
}
