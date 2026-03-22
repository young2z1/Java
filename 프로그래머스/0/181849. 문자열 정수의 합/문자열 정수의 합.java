class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] li = num_str.split("");
        for (String s : li) {
            answer += Integer.valueOf(s);
        }
        
        return answer;
    }
}