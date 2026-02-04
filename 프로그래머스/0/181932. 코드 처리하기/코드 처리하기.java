class Solution {
    public String solution(String code) {
        String[] arCd = code.split("");
        String answer = "";
        int mode = 0;
        for (int idx = 0; idx<code.length(); idx++) {
            if (mode == 0) {
                if (arCd[idx].equals("1")) {
                    mode = 1;
                } else {
                    answer = (idx%2==0) ? answer += arCd[idx] : answer;
                }
            } else {
                if (arCd[idx].equals("1")) {
                    mode = 0;
                } else {
                    answer = (idx%2!=0) ? answer += arCd[idx] : answer;
                }
            }
        }
        return answer != "" ? answer : "EMPTY";
    }
}