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
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix.length;j++){
                if (stack.size() < k){
                    stack.add(matrix[i][j]);
                }else {
                    if(matrix[i][j] < stack.peek());
                    stack.pop();
                    stack.add(matrix[i][j]);
                }
            }
        }
        System.out.println(stack);
        return 0;
    }
}
