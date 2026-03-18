class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int h1 = 0;
        int h2 = 0;
        
        if (arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else {
            for (int i = 0; i<arr1.length; i++) {
                h1 += arr1[i];
                h2 += arr2[i];
            }
            if (h1>h2) answer = 1;
            else if (h1<h2) answer = -1;
            else answer = 0;
        }
        
        return answer;
    }
}