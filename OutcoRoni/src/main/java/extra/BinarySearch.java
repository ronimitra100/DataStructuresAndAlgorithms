package extra;

/**
 * Created by ronim_000 on 11/3/2019.
 */
public class BinarySearch {
    public static void main(String[] args){
        BinarySearch bs = new BinarySearch();
        int[] a = {3, 6,7, 10, 15, 20, 23, 30};
        System.out.println(bs.binarySearch(a,23));
        System.out.println(bs.binarySearch(a,3));
        System.out.println(bs.binarySearch(a,5));
        System.out.println(bs.binarySearchIterative(a,23));
        System.out.println(bs.binarySearchIterative(a,3));
        System.out.println(bs.binarySearchIterative(a,5));
    }
    public boolean binarySearch(int[] array, int x){
        return binarySearchRecursive(array, x, 0, array.length-1);
    }

    public boolean binarySearchRecursive(int[] arr, int n, int left, int right){
        if (left > right){
            return false;
        }

        int mid=left + ((right-left)/2);

        if (arr[mid]==n){
            return true;
        }
        else if (n<arr[mid]){
            return binarySearchRecursive(arr, n, left, mid-1);
        }
        else{
            return binarySearchRecursive(arr, n, mid+1, right);
        }
    }

    public boolean binarySearchIterative(int[] arr, int n){
        int left=0;
        int right = arr.length-1;

       while (left<=right) {
           int mid = left + ((right - left) / 2);

           if (arr[mid] == n) {
               return true;
           } else if (n < arr[mid]) {
              right=mid-1;
           } else {
               left=mid+1;
           }
       }

       return false;
    }
}
