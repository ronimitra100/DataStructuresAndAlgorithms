package extra;

/**
 * Created by ronim_000 on 11/16/2019.
 */
public class MergeSort {
    int[] temp;
    public static void main(String[] args){
        int[] a = {5,7,3,9,1,5, 11,2};
        mergeSort(a);
        print(a);
    }

    public static void print(int[] array){
        if (array==null || array.length==0){
            return;
        }
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void mergeSort(int[] array){
        if (array==null || array.length<=1){
            return;
        }
        int[] temp = new int[array.length];
        mergeSort(array, temp, 0, array.length-1);

    }

    public static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd){
        if (leftStart>=rightEnd){
            return;
        }
        int middle = leftStart + ((rightEnd-leftStart)/2);
        mergeSort(array, temp, leftStart, middle);
        mergeSort(array, temp, middle+1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);
    }

    public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd){
        int leftEnd = leftStart + (rightEnd-leftStart)/2;
        int rightStart = leftEnd +1;
        int size=rightEnd-leftStart+1;

        int left=leftStart;
        int right=rightStart;
        int index=leftStart;

        while (left<=leftEnd && right<=rightEnd){
            if (array[left] <=array[right]){
                temp[index] =array[left];
                left++;
            }
            else{
                temp[index]=array[right];
                right++;
            }
            index++;
        }

        System.arraycopy(array, left, temp, index, leftEnd-left+1);
        System.arraycopy(array, right, temp, index, rightEnd-right+1);
        System.arraycopy(temp, leftStart,array,leftStart, size);
    }

}
