package extra;

/**
 * Created by ronim_000 on 11/17/2019.
 */
public class QuickSort {
    public static void main(String[] args){
        int[] a = {5,7,3,9,1,11,2,-1,-10,50,0};
        int[] b = {5,7,3,9,15,1,11,2, 8,17,26};
        quickSort(a);
        quickSort(b);
        print(a);
        print(b);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    public static void print(int[] array){
        if (array==null || array.length<=1){
            return;
        }


        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    private static void quickSort(int[] array){
        quickSort(array,0,array.length-1);
    }

    private static void quickSort(int[] array, int left, int right){
        if (left>=right){
            return;
        }

        int i=left;
        int j=right-1;

        while(i<=j){
            if (array[i]<=array[right]){
                i++;
            }

            else{
                swap(array,i,j);
                j--;
            }

        }

        swap(array,i,right);
        if (i-1>left){
        quickSort(array,left,i-1);}
        if (i+1<right){
        quickSort(array,i+1,right);}

    }
}
