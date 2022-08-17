package solution;

import java.util.HashSet;
import java.util.Set;

/**
 *剑指 Offer 03. 数组中重复的数字
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/17 16:23
 */
public class FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return 0;
    }
}
