package main;

import solution.*;
import tool.*;
import java.util.Arrays;


/**
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/16 9:50
 */
public class TrainingCampSecondDay {
    public static void main(String[] args) {
        int[] nums = {4,2,5,9,7,4,8};
        ArrayRankTransform arrayRankTransform = new ArrayRankTransform();
        System.out.println(Arrays.toString(arrayRankTransform.arrayRankTransform(nums)));
    }
}
