import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList(my_string.split(" ")));
        for (int i = al.size() - 1; i >= 0; i--) {
            if (al.get(i).equals("")) {
                al.remove(i);
            }
        }
        
        String[] answer = new String[al.size()];
        for (int i = 0; i<al.size(); i++) {
            answer[i] = al.get(i);
        }
        return answer;
    }
}