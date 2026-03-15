import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i<flag.length; i++) {
            if (flag[i]) {
                int lp = 0;
                while (lp<arr[i]*2) {
                    al.add(arr[i]);
                    lp++;
                }
            } else {
                int l = 0;
                while (l<arr[i]) {
                    al.remove(al.size()-1);
                    l++;
                }
            }
        }
        int[] answer = new int[al.size()];
        for (int i = 0; i<al.size(); i++) {
            answer[i] = al.get(i);
        }
        return answer;
    }
}