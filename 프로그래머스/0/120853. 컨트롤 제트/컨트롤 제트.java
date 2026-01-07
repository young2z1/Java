class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int answer = 0;
        int prev = 0;
        
        for (String i : arr) {
            if (i.equals("Z")) {
                answer -= prev;
            } else {
                prev = Integer.parseInt(i);
                answer += prev;
            }
        }
        return answer;
    }
}