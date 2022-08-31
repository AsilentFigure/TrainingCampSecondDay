package solution;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *剑指 Offer II 060. 出现频率最高的 k 个数字
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/22 11:25
 */
public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        for(int num : map.keySet()){
            priorityQueue.add(num);
            if (priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }
        int [] kNum = new int[k];
        for(int i = k - 1; i > -1;i--){
            kNum[i] = priorityQueue.poll();
        }
        return kNum;
    }
}
