import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (String str : intStrs) {
            int idx = 0;
            String sub = str.substring(s, s+l);
            if (k<Integer.parseInt(sub)) {
                arr.add(Integer.parseInt(sub));
            }
            sub="";
        }
        
        int[] answer = new int[arr.size()];
        for (int i = 0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}