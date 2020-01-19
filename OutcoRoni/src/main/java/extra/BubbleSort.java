package extra;

/**
 * Created by ronim_000 on 11/16/2019.
 */
public class BubbleSort {
    public static void main(String[] args){
       int[] a = {5,7,3,9,1,11,2};
        bubbleSort(a);
       print(a);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] array){

        for (int i=0; i<array.length-1; i++){
            for (int j=0; j<array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    swap(array, j,j+1);
                }
            }
        }
    }

    public static void print(int[] array){
        if (array==null || array.length==0){
            return;
        }
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
