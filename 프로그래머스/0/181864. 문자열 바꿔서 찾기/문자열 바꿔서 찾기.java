class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder(myString);
        for (int i = 0; i<myString.length(); i++) {
            if (sb.charAt(i) == 'A') {
                sb.setCharAt(i, 'B');   
            } else {
                sb.setCharAt(i, 'A');
            }
        }
        
        if (sb.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}