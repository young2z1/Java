class Solution {
    public String solution(String my_string, int n) {
        String[] str = my_string.split("");
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            answer += str[i].repeat(n);
        }
        return answer;
    }
}