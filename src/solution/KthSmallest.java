package solution;

import java.util.*;

/**
 *378. 有序矩阵中第 K 小的元素
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/18 9:35
 */
public class KthSmallest {

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue priorityQueue = new PriorityQueue<Integer>();
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(priorityQueue.size() < k){
                    priorityQueue.add(matrix[i][j]);
                }else if(matrix[i][j] < (Integer) priorityQueue.peek()){
                    priorityQueue.poll();
                    priorityQueue.add(matrix[i][j]);
                }
            }
        }
        return 0;
    }
}
