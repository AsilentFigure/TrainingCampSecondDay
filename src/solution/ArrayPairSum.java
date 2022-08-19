package solution;

import java.util.Arrays;

/**
 *561. 数组拆分
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/19 14:49
 */
public class ArrayPairSum {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0;i < nums.length;i=i+2){
            result += nums[i];
        }
        return result;
    }
}
