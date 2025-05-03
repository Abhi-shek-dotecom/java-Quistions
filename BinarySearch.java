package DataStructure;

public class BinarySearch {
    public static int binarySearch(int []arr, int start, int terget,int end){
        int mid = start + (end - start)/2;
        if(start <= end){
            if(arr[mid] == terget){
                return mid;
            }
            if (arr[mid] > terget) {
                return binarySearch(arr, start,terget, mid - 1);
            }else {
                return binarySearch(arr,mid+1,terget,end);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,2,3,4,5,6,6,6,7,8,8,8,9};
        int terget = 2;
        System.out.println(binarySearch(arr,0, terget,arr.length-1));
    }
}
