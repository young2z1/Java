class Solution {
    public String solution(String rsp) {
        String[] arrRsp = rsp.split("");
        String[] answer = new String[arrRsp.length];
        for (int i = 0; i < arrRsp.length; i++) {
            if (arrRsp[i].equals("2")) {
                answer[i] = "0";
            } else if (arrRsp[i].equals("0")) {
                answer[i] = "5";
            } else {
                answer[i] = "2";
            }
        }
        return String.join("", answer);
    }
}