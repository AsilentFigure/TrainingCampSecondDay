package main;

import solution.*;
import tool.*;

import java.awt.*;
import java.util.Arrays;

/**
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/16 9:50
 */
public class TrainingCampSecondDay {
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
        TopKFrequent topKFrequent = new TopKFrequent();
        System.out.println(Arrays.toString(topKFrequent.topKFrequent(nums, 2)));
    }
}
