class Solution {
    public int solution(int n) {
        String[] arrStr = String.valueOf(n).split("");
        int answer = 0;
        for (String s : arrStr) {
            int a = Integer.parseInt(s);
            answer += a;
        }
        return answer;
    }
}