import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String[] answer = new String[index_list.length];
        int idx = 0;
        
        String[] arr = my_string.split("");
        for (int i : index_list) {
            answer[idx] = arr[i];
            idx++;
        }
        
        return String.join("", answer);
    }
}