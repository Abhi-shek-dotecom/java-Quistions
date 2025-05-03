package DataStructure.practiceQuiestion;

public class leargestelement {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,3,2,14,5,69,8759,596,65,54,6};
        int max = Integer.MIN_VALUE;
        for (int num : arr){
            if (max < num){
                max  = num;
            }
        }
        System.out.println(max);
    }
}
