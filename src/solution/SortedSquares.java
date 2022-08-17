package solution;

import java.util.Arrays;

/**
 *977. 有序数组的平方
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/16 16:07
 */
public class SortedSquares {

    public int[] sortedSquares1(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            nums[i] = nums[i]^2;
        }
        Arrays.sort(nums);
        return nums;
    }

    public int[] sortedSquares(int[] nums) {
        int[] result = new int [nums.length];
        int i = 0;
        int index = nums.length - 1;
        int j = nums.length - 1;
        while (i <= j){
            if(nums[i] * nums[i] <= nums[j] * nums[j]){
                result[index] = nums[j] * nums[j];
                j--;
                index--;
            }else {
                result[index] = nums[i] * nums[i];
                i++;
                index--;
            }
        }
        return result;
    }
}
