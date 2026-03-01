class Solution {
    public String[] solution(String[] names) {
        int length = names.length%5==0 ? names.length/5 : names.length/5+1;
        String[] answer = new String[length];
        int idx = 0;
        
        for (int i = 0; i<answer.length; i++) {
            answer[i] = names[idx];
            idx += 5;
        }
        
        return answer;
    }
}