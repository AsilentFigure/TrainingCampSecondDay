package solution;

import java.util.ArrayList;
import java.util.List;

/**
 *350. 两个数组的交集 II
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/16 11:01
 */
public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] cnt1 = new int[1001];
        int[] cnt2 = new int[1001];
        for(int num1 : nums1){
            cnt1[num1]++;
        }
        for(int num2 : nums2){
            cnt2[num2]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < cnt1.length;i++){
            while (cnt1[i] > 0 && cnt2[i] > 0){
                list.add(i);
                cnt1[i]--;
                cnt2[i]--;
            }
        }
        nums2 =list.stream().mapToInt(Integer::valueOf).toArray();
        return nums2;
     }
}
