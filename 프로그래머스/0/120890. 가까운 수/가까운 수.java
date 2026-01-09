import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        int mn = Math.abs(n-array[0]);
        
        for (int i = 1; i<array.length; i++) {
            if (Math.abs(n - array[i]) < mn) {
                answer = array[i];
                mn = Math.abs(n-array[i]);
            }
        }
        
        return answer;
    }
}