import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList(myString.trim().split("x")));
        
        for (int i = 0; i<al.size(); i++) {
            if (al.get(i).isBlank()) {
                al.remove(i);
                i--;
            }
        }
        
        String[] answer = new String[al.size()];
        for (int i = 0; i<al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}