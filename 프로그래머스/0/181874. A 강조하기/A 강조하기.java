class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder(myString);
        
        for (int i = 0; i<myString.length(); i++) {
            if (sb.charAt(i) == 97 || sb.charAt(i) == 65) {
                sb.setCharAt(i, 'A');
            } else {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }
}