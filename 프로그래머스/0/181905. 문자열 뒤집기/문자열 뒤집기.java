class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder rev = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        answer.append(my_string);
        rev.append(my_string.substring(s,e+1));
        
        return answer.replace(s,e+1,rev.reverse().toString()).toString();
    }
}