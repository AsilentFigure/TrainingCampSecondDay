package solution;

import java.util.Arrays;

/**
 *977. 有序数组的平方
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/16 16:07
 */
public class SortedSquares {

    public int[] sortedSquares(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            nums[i] = nums[i]^2;
        }
        Arrays.sort(nums);
        return nums;
    }
}
