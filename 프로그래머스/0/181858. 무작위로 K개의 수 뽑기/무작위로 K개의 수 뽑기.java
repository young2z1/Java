import java.util.Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i<arr.length; i++) {
            set.add(arr[i]);
        }
        
        ArrayList<Integer> al = new ArrayList<>(set);
        int[] answer = new int[k];
        
        for (int j = 0; j<k; j++) {
            if (j>=al.size()) {
                answer[j] = -1;
            } else {
                answer[j] = al.get(j);
            }
        }
        
        return answer;
    
    }
}