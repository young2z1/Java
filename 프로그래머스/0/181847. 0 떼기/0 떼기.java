class Solution {
    public String solution(String n_str) {
        int i = 0;
        while (i < n_str.length()) {
            if (n_str.charAt(i) != '0') {
                break;
            }
            i++;
        }
        return n_str.substring(i, n_str.length());
    }
}