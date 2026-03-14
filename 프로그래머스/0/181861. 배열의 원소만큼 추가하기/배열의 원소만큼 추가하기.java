class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        for (int i : arr) length += i;
        int[] answer = new int[length];
        int idx = 0;
        
        for (int i = 0; i<arr.length; i++) {
            int j = arr[i];
            while (j>0) {
                answer[idx++] = arr[i];
                j--;
            }
        }
        
        return answer;
    }
}