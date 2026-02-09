import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i<arr.length;) {
            if (answer.isEmpty()) {
                answer.add(arr[i]);
                i++;
            } else if (answer.get(answer.size()-1) < arr[i]) {
                answer.add(arr[i]);
                i++;
            } else if (answer.get(answer.size()-1) >= arr[i]) {
                answer.remove(answer.size()-1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}