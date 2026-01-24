class Solution {
    public int solution(String my_string) {
        String[] arrStr = my_string.split(" ");
        int answer = Integer.parseInt(arrStr[0]);
        for (int i = 1; i<arrStr.length; i++) {
            if (arrStr[i].equals("+")) {
                answer += Integer.parseInt(arrStr[i+1]);
                i += 1;
            } else {
                answer -= Integer.parseInt(arrStr[i+1]);
                i += 1;
            }
        }
        return answer;   
    }
}