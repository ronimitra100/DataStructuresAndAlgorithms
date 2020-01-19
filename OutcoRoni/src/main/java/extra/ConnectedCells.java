package extra;

/**
 * Created by ronim_000 on 11/16/2019.
 */
public class ConnectedCells {

    public static int getBiggestRegion(int[][] matrix){
        int maxRegionSize=0;
        for (int row =0; row <matrix.length; row++){
            for (int column=0; column <matrix[row].length; column++){
                if (matrix[row][column]==1){
                    maxRegionSize = Math.max(maxRegionSize,getRegionSize(matrix, row, column));
                }
            }
        }
        return maxRegionSize;
    }

    public static int getRegionSize(int[][] matrix, int row, int column){
        if (row <0 || column<0 || row>=matrix.length || column>matrix[0].length){
            return 0;
        }

        if (matrix[row][column]==0){
            return 0;
        }
        int size=1;
        matrix[row][column]=0;
        for (int r = row-1; r<=row+1; r++){
            for (int c=column-1; c<=column+1; c++){
                size += getRegionSize(matrix, r, c);
            }
        }


        return size;
    }
}
