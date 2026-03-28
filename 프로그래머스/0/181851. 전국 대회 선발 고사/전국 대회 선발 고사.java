import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i<rank.length; i++) {
            if (attendance[i]) al.add(rank[i]);
        }
        
        int[] answer = new int[al.size()];
        for (int j = 0; j<al.size(); j++) {
            answer[j] = al.get(j);
        }
        
        Arrays.sort(answer);
        int a = 0;
        int b = 0;
        int c = 0;
        for (int idx = 0; idx<rank.length; idx++) {
            if (rank[idx] == answer[0]) a = idx;
            else if (rank[idx] == answer[1]) b = idx;
            else if (rank[idx] == answer[2]) c = idx;
        }
        return 10000*a + 100*b + c;
    }
}