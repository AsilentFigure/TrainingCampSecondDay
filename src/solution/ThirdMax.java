package solution;

import java.util.Arrays;
import java.util.TreeSet;

/**
 *414. 第三大的数
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/16 11:25
 */
public class ThirdMax {

    public int thirdMax1(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        Arrays.sort(nums);
        max1 = nums[nums.length - 1];
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] != max1){
                max2 = nums[i];
                break;
            }
        }
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] != max2 && nums[i] != max1){
                max3 = nums[i];
                return max3;
            }
        }
        return max1;
    }

    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums){
            set.add(num);
            if(set.size() > 3){
                set.remove(set.first());
            }
        }
        return set.size() == 3 ? set.first():set.last();
    }

}
