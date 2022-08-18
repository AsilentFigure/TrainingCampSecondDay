package solution;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *剑指 Offer 50. 第一个只出现一次的字符
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/17 16:32
 */
public class FirstUniqChar {

    public char firstUniqChar1(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else {
                map.put(s.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return ' ';
    }

    public char firstUniqChar(String s) {
        Map<Character, Boolean> map = new LinkedHashMap<>();
        char[] sChar = s.toCharArray();
        for(char charS : sChar){
            if(map.containsKey(charS)){
                map.put(charS, false);
            }else {
                map.put(charS, true);
            }
        }
        for(Map.Entry<Character, Boolean> entry : map.entrySet()){
            if(entry.getValue()){
                return entry.getKey();
            }
        }
        return ' ';
    }
}
