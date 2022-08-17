package main;

import solution.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/16 9:50
 */
public class TrainingCampSecondDay {
    public static void main(String[] args) {
        FindMinDifference findMinDifference = new FindMinDifference();
        List<String> timePoints = new ArrayList<>();
        timePoints.add("00:00");
        timePoints.add("04:00");
//        timePoints.add("02:05");
//        timePoints.add("03:11");
//        timePoints.add("04:30");
//        timePoints.add("05:18");
//        timePoints.add("06:42");
//        timePoints.add("07:35");
//        timePoints.add("08:28");
//        timePoints.add("01:13");
//        timePoints.add("05:07");
//        timePoints.add("10:10");
//        timePoints.add("20:48");
        timePoints.add("22:59");
        System.out.println(findMinDifference.findMinDifference(timePoints));
    }
}
