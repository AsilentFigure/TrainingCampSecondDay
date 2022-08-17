package solution;

/**
 *剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/17 10:42
 */
public class Exchange {

    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right && right >= 0 && left <= right){
            if((nums[left]&1) == 0 && (nums[right] &1) == 0){
                right--;
            }else if((nums[left]&1) == 0 && (nums[right] &1) != 0){
                swap(nums, left, right);
                left++;
                right--;
            }else if((nums[left]&1) != 0 && (nums[right] &1) == 0){
                left++;
                right--;
            }else {
                left++;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
