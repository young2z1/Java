class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = c-1; i<my_string.length();) {
            answer.append(my_string.charAt(i));
            i+=m;
        }
        
        return answer.toString();
    }
}