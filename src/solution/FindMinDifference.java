package solution;

import java.util.Collections;
import java.util.List;

/**
 *539. 最小时间差
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/16 14:56
 */
public class FindMinDifference {

    public int findMinDifference(List<String> timePoints) {
        if(timePoints.size() > 1440){
            return 0;
        }
        int result = Integer.MAX_VALUE;
        Collections.sort(timePoints);
        for(int i = 1; i < timePoints.size(); i++){
            result = Math.min(result, stringMinus(timePoints.get(i-1), timePoints.get(i)));
        }
        if(stringMinus(timePoints.get(0), timePoints.get(timePoints.size() - 1)) > 0){
            return Math.min(result, stringMinus(timePoints.get(0), timePoints.get(timePoints.size() - 1)));
        }
        return result;
    }

    private int stringMinus(String timePoint1, String timePoint2){
        int hour = Integer.valueOf(timePoint2.charAt(0) * 10 + timePoint2.charAt(1)) - Integer.valueOf(timePoint1.charAt(0) * 10 + timePoint1.charAt(1));
        int minute = Integer.valueOf(timePoint2.charAt(3) * 10 + timePoint2.charAt(4)) - Integer.valueOf(timePoint1.charAt(3) * 10 + timePoint1.charAt(4));
        int result = hour * 60 + minute;
        if(result > 12 * 60){
            return 24 * 60 - result;
        }
        return result;
    }
}
