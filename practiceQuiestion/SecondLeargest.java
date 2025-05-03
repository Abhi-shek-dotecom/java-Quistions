package DataStructure.practiceQuiestion;

public class SecondLeargest {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,3,2,14,596,69,596,596,65,54,6};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int num : arr){
            if (max < num){
                smax = max;
                max  = num;
            }
            if (smax < num && num < max){
                smax = num;
            }
        }
        System.out.println(smax);
    }
}
