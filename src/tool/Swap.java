package tool;

/**
 *交换数组中的两个元素
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/17 10:52
 */
public class Swap {

    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
