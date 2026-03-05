import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i<strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                al.add(strArr[i]);
            }
        }
        String[] answer = new String[al.size()];
        for (int i = 0; i<al.size(); i++) {
            answer[i] = al.get(i);
        }
        return answer;
    }
}