import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>(); 
        int count = 0;
        
        for (int i = l; i<=r; i++) {
            String s = String.valueOf(i);
            if (s.replace("5","").replace("0","").isEmpty()) {
                answer.add(i);
                count++;
            }
        }
        if (count == 0) {
            answer.add(-1);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}