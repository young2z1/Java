import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a-c]", " ");
        String[] em = {"EMPTY"};
        String[] st = myStr.split(" ");
        ArrayList<String> al = new ArrayList<>(Arrays.asList(st));
        for (int i = 0; i<al.size(); i++) {
            if (al.get(i).isEmpty()) {
                al.remove(i);
                i--;
            }
        }
        String[] answer = new String[al.size()];
        for (int i = 0; i<al.size(); i++) {
            answer[i] = al.get(i);
        }
        if (st.length == 0) {
            return em;
        } else {
            return answer;
        }
    }
}