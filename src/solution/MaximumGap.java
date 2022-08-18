package solution;

import java.util.Arrays;

/**
 *164. 最大间距
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/18 10:20
 */
public class MaximumGap {

    public int maximumGap(int[] nums) {
        if(nums.length < 2){
            return 0;
        }
        if(nums.length == 2){
            return nums[1] - nums[0];
        }
        int result = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i] - nums[i-1] > result){
                result = nums[i] - nums[i-1];
            }
        }
        return result;
    }
}
