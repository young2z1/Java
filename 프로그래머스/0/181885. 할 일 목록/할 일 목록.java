import java.util.Arrays;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int length = 0;
        for (boolean b : finished) {
            if (!b) length++;
        }
        String[] answer = new String[length];
        int idx = 0;
        
        for (int i = 0; i<todo_list.length; i++) {
            if (!finished[i]) {
                answer[idx++] = todo_list[i];
            }
        }
        
        return answer;
    }
}