class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i<queries.length; i++) {
            int m = 1000001;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    if (arr[j] < m) {
                        m = arr[j];
                    }   
                }
            }
            if (m != 1000001) {
                answer[i] = m;
            } else {
                answer[i] = -1;
            }
            
        }
        return answer;
    }
}