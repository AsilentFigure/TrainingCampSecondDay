package solution;

/**
 *905. 按奇偶排序数组
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/19 11:14
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        if(nums.length <= 1){
            return nums;
        }
        int left = 0;
        int right = nums.length - 1;
        while (true){
            while ((nums[left] &1) == 0 && left < nums.length - 1){
                left++;
            }
            while ((nums[right] &1) == 1 && right > 0){
                right--;
            }
            if(left >= right){
                break;
            }
            swap(nums, left, right);
        }
        return nums;
    }

    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
