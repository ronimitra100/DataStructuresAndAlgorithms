package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean canJump(int[] nums) {
        if (nums==null||nums.length<=1||nums. ||nums.indexOf(0)==nums.length-1){
            return true;
        }

        List<Integer> indicesOfZero = new ArrayList<Integer>();

        for (int i=0; i<nums.length; i++){
            if (nums[i]==0){
                indicesOfZero.add(0);
            }
        }


        boolean tempResult = false;

        for (int j=0; j<indicesOfZero.size(); j++){
            int idx = indicesOfZero.get(j);

            for (int k=0; k<=idx; k++){
                tempResult = false;
                if (nums[k] >(idx-k)){
                    tempResult = true;
                    continue;
                }
            }

            return tempResult;
        }

    }
}