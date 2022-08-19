package solution;

import java.util.Arrays;

/**
 *剑指 Offer 39. 数组中出现次数超过一半的数字
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/19 15:15
 */
public class MajorityElementSecond {

    public int majorityElement1(int[] nums) {
        Integer candidate = null;
        int count = 0;
        for(int num : nums){
            if(0 == count){
                candidate = num;
            }
            if(candidate == num){
                count++;
            }else {
                count--;
            }
        }
        return candidate;
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
