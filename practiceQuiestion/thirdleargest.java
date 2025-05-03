package DataStructure.practiceQuiestion;

public class thirdleargest {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,3,2,14,596,69,596,596,65,54,6};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = 0;
        for (int num : arr){
            if (max < num){
                tmax = smax;
                smax = max;
                max  = num;
            }
            else if (smax < num && num < max){
                tmax = smax;
                smax = num;
            } else if (num > tmax && num < smax && num < smax)  {
                tmax = num;
            }

        }
        System.out.println(tmax);
    }
}
