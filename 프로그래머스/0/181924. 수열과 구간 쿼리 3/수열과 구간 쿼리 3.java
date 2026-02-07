class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i<queries.length; i++) {
            int fIdx = queries[i][0];
            int nIdx = queries[i][1];
            
            int fi = arr[fIdx];
            int ni = arr[nIdx];
            
            arr[fIdx] = ni;
            arr[nIdx] = fi;
        }      
        return arr;
    }
}