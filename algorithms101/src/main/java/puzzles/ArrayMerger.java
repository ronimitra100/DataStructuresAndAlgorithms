package puzzles;

/**
 * Created by ronim_000 on 8/6/2019.
 */
public class ArrayMerger {

    public static void main(String[] args){
        ArrayMerger merger = new ArrayMerger();
        int[] arr1 = {2,4,7,9};
        int[] arr2 = {2,5,8,9};
        merger.mergeArray(arr1, arr2);
    }
    public void mergeArray(int[] arr1, int[] arr2){
        int l1 = arr1.length;
        int l2 = arr2.length;
        int l3 = l1+l2;
        int[] arr3 = new int[l1+l2];

        int i=0;
        int j=0;
        int k=0;

        while(i<l1 && j<l2){
            if (arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }
            else if(arr1[i] >arr2[j]){
                arr3[k] = arr2[j];
                j++;
            }
            else{
                arr3[k]=arr1[i];
                arr3[k+1]=arr2[j];
                i++;
                j++;
                k++;
            }
            k++;
        }

        for (int m=0; m<l3; m++){
            System.out.println(arr3[m]);
        }
    }
}
