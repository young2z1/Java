import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i<arr.length; i++) {
            if (al.size() == 0) {
                al.add(arr[i]);
            } else if (al.get(al.size()-1) == arr[i]) {
                al.remove(al.size()-1);    
            } else {
                al.add(arr[i]);
            }
        }
        
        int[] answer = new int[al.size()];
        int[] emAnswer = new int[1];
        if (al.size() == 0) {
            emAnswer[0] = -1;
            return emAnswer;
        }
        for (int i = 0; i<al.size(); i++) {
            answer[i] = al.get(i);
        }
        return answer;
    }
}