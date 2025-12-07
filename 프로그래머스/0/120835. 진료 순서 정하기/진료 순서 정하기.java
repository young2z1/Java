class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int idx = 0; idx < emergency.length; idx++) {
            answer[idx] = 1; //기본값 1
            for (int cidx = 0; cidx < emergency.length; cidx++) {
                if (emergency[idx] < emergency[cidx]) { //비교값보다 작을 때마다 +1
                    answer[idx]++;
                }
            }
        }
        return answer;
    }
}