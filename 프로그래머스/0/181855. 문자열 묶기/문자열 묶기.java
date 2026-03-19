import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        ArrayList<Integer> al = new ArrayList<>();
        
        for (String s : strArr) {
            al.add(s.length());
        }
        
        int[] count = new int[31];
        for (int i : al) {
            count[i]++;
        }
        
        int cmp = 0;
        for (int j = 0; j<count.length; j++) {
            if (cmp<count[j]) cmp = count[j];
        }
        return cmp;
        
    }
}