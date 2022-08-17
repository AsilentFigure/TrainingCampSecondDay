package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *229. 多数元素 II
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/16 10:22
 */
public class MajorityElement {

    public List<Integer> majorityElement1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n) + 1);
            }else {
                map.put(n, 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > (double)(nums.length / 3)){
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public List<Integer> majorityElement(int[] nums) {
        int element1 = 0;
        int element2 = 0;
        int vote1 = 0;
        int vote2 = 0;

        for(int n : nums){
            if(vote1 > 0 && n == element1){
                vote1++;
            }else if(vote2 > 0 && n == element2){
                vote2++;
            }else if(vote1 == 0){
                element1 = n;
                vote1++;
            }else if(vote2 == 0){
                element2 = n;
                vote2++;
            }else {
                vote1--;
                vote2--;
            }
        }

        int cnt1 = 0;
        int cnt2 = 0;
        for(int n : nums){
            if(vote1 > 0 && n == element1){
                cnt1++;
            }
            if(vote2 > 0 && n == element2){
                cnt2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        if(vote1 > 0 && cnt1 > nums.length / 3){
            list.add(element1);
        }
        if(vote2 > 0 && cnt2 > nums.length / 3){
            list.add(element2);
        }
        return list;
    }
}
