package ArraysAndStrings;

/**
 * Created by ronim_000 on 8/18/2019.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int l=0;
        int r = height.length-1;
        int area = 0;

        while (l<r){
            area = Math.max(area, (r-l)*Math.min(height[l], height[r]));

            if (height[l] <height[r]){
                l +=1;
            }
            else{
                r-=1;
            }
        }

        return area;

    }
}
