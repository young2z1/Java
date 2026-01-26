class Solution {
    public int solution(int num, int k) {
        String[] arrStr = String.valueOf(num).split("");
        int answer = 0;
        
        for (int i = 0; i<arrStr.length; i++) {
            if (arrStr[i].equals(String.valueOf(k))) {
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }
}