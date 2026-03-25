import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int num : arr) al.add(num);
        
        for (int i = 0; i<al.size(); i++) {
            for (int j = 0; j<delete_list.length; j++) {
                if (al.get(i) == delete_list[j]) {
                    al.remove(i);
                    i--;
                    break;
                }
            }
        }
        int[] answer = new int[al.size()];
        for (int a = 0; a<al.size(); a++) {
            answer[a] = al.get(a);
        }
        return answer;
    }
}