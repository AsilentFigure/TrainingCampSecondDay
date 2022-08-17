package solution;

/**
 *面试题 10.01. 合并排序的数组
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/17 9:54
 */
public class Merge {

    public void merge(int[] A, int m, int[] B, int n) {
        if(m == 0){
            System.arraycopy(B,0,A,0,n);
        }
        else if(n != 0) {
            int i = m - 1;
            int j = n - 1;
            int aLen = m+n;
            while (aLen >= 0 && j >= 0 && i>= 0){
                if(A[i] >= B[j]){
                    A[--aLen] = A[i];
                    i--;
                }else {
                    A[--aLen] = B[j];
                    j--;
                }
            }
            if(j >= 0){
                System.arraycopy(B, 0,A,0,j+1);
            }
        }
    }
}
