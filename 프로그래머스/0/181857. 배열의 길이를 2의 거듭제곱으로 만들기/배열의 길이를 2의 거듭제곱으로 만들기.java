class Solution {
    public int[] solution(int[] arr) {
        int lg = 1;
        
        while (lg < arr.length) {
            lg *= 2;
        }
        
        int[] answer = new int[lg];
        for (int i = 0; i<answer.length; i++) {
            if (i>=arr.length) answer[i] = 0;
            else answer[i] = arr[i];
        }
        return answer;
    }
}