class Solution {
    public String solution(String cipher, int code) {
        String[] answer = new String[cipher.length() / code];
        int w = -1;
        for (int i = 0; i < cipher.length()/code; i++) {
            answer[i] = String.valueOf(cipher.charAt(w+code));
            w = w+code;
        }
        return String.join("", answer);
    }
}