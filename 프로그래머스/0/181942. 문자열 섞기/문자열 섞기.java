class Solution {
    public String solution(String str1, String str2) {
        String[] arrStr1 = str1.split("");
        String[] arrStr2 = str2.split("");
        String[] arrAns = new String[str1.length() + str2.length()];
        int idx = 0;
        for (int i = 0; i<str1.length(); i++) {
            arrAns[idx] = arrStr1[i];
            idx++;
            arrAns[idx] = arrStr2[i];
            idx++;
        }
        return String.join("", arrAns);
    }
}