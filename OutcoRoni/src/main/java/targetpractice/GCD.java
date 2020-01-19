package targetpractice;

/**
 * Created by ronim_000 on 12/1/2019.
 */
public class GCD {

    public static void main(String[] args){
        GCD gcd = new GCD();
        int[] a = {78, 39, 26, 91, 52, 12, 104};
        System.out.println(gcd.generalizedGCD(7, a ));
    }

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int generalizedGCD(int num, int[] arr)
    {
        // WRITE YOUR CODE HERE
        int arrMin=arr[0];
        int arrDivisor= arr[0];

        while (!isCommonDivisor(arr,arrDivisor)){

            for (int i=0; i<arr.length; i++){
                arr[i]= (arr[i] % arrDivisor);
            }
            arrDivisor=minOfArray(arr);
        }

        return arrDivisor;
    }
    // METHOD SIGNATURE ENDS

    //This method determines the minimum postive number
    //in an array of non-negative numbers
    public int minOfArray(int[] a){
        int min=Integer.MAX_VALUE;
        for (int i=0; i<a.length;i++){
            if (a[i]!=0 && a[i]<min){
                min=a[i];
            }
        }

        return min;
    }


    //This method determines whetehr d is a common
    //divisor of all elements in array a or not
    public boolean isCommonDivisor(int[] a, int d){
        for (int i=0; i<a.length; i++){
            if (a[i]%d!=0){
                return false;
            }
        }

        return true;
    }
}
