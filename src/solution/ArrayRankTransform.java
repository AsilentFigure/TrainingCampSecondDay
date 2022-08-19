package solution;

import com.sun.media.sound.SoftTuning;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

/**
 *1331. 数组序号转换
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/19 15:21
 */
public class ArrayRankTransform {

    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(
            new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for(int num : arr){
            if(!treeMap.containsKey(num)){
                treeMap.put(num, treeMap.size() + 1);
            }
        }
        System.out.println(treeMap);
//        for(int i = 0;i < arr.length;i++){
//            arr[i] = treeMap.get(arr[i]);
//        }
        return arr;
    }
}
