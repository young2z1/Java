class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String[] answer = my_string.split("");
        String[] arrOver = overwrite_string.split("");
        for (int i = 0; i<overwrite_string.length(); i++) {
            answer[i+s] = arrOver[i];
        }
        return String.join("", answer);
    }
}