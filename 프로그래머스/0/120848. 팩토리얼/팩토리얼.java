class Solution {
    public int solution(int n) {
        int f = 1;
        int answer = 0;
        for (int i = 1; f<=n; i++) {
            answer = i;
            f *= i;
        }
        return answer-1;
    }
}