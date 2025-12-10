class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 4; i<=n; i++) {
            int check = 0;
            for (int c = 1; c<=i; c++) {
                if (i%c == 0) check++;
                if (check==3) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}