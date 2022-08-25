package solution;

/**
 *1748. 唯一元素的和
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/22 11:18
 */
public class SumOfUnique {

    public int sumOfUnique(int[] nums) {
        int[] cnt = new int[101];
        for(int num : nums){
            cnt[num]++;
        }
        int sum = 0;
        for(int i = 0; i < cnt.length;i++){
            if(cnt[i] == 1){
                sum+=i;
            }
        }
        return sum;
    }
}
