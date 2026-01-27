import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> alInt = new ArrayList<>();
        for (int i : numlist) {
            if (i%n == 0) {
                alInt.add(i);
            }
        }
        int[] answer = new int[alInt.size()];
        for (int i = 0; i<alInt.size(); i++) {
            answer[i] = alInt.get(i);
        }
        return answer;
    }
}