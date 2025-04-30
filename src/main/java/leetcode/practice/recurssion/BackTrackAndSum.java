package leetcode.practice.recurssion;

import java.util.ArrayList;
import java.util.List;

public class BackTrackAndSum {

    public static void main(String[] args) {
        int result = backTrackAndSum("125");
        System.out.println(result);
    }

    public static int backTrackAndSum(String str) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(str, 0, new ArrayList<>(), result);

        int output = 0;
        for(List<Integer> list : result) {
            output += list.stream().mapToInt(Integer::intValue).sum();
        }
        return output;
    }

    public static void backTrack(String str,  int index, List<Integer> current, List<List<Integer>> result) {
        if(str.length() == index) {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = index+1;i<= str.length();i++) {
            String part = str.substring(index,i);
            if(part.startsWith("0")  && part.length()>1) continue;

            Integer num = Integer.parseInt(part);
            current.add(num);
            backTrack(str,i,current,result);
            current.remove(current.size()-1);

        }
    }
}
