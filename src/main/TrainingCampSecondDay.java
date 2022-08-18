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
        int[][] matrix = new int[][]{ {1,5,9}, {10, 11, 13}, {12, 13, 15}};
        KthSmallest kthSmallest = new KthSmallest();
        System.out.println(kthSmallest.kthSmallest(matrix, 8));
    }
}
