package solution;

import java.util.Arrays;

/**
 *1913. 两个数对之间的最大乘积差
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/19 15:01
 */
public class MaxProductDifference {

    public int maxProductDifference(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        ans = nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
        return ans;
    }
}
