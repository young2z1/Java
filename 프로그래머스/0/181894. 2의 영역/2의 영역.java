import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i<arr.length; i++) {    // 2인 인덱스만 담아두기
            if (arr[i] == 2) {
                al.add(i);
            }
        }
        
        int[] answer;
        int idx = 0;
        if (!al.isEmpty()) {
            int start = al.get(0);
            int end = al.get(al.size()-1);
            answer = Arrays.copyOfRange(arr, start, end+1);
        } else {
            answer = new int[]{-1};
        }
        return answer;
    }
}