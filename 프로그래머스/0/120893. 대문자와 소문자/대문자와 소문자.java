class Solution {
    public String solution(String my_string) {
        char arrAnswer[] = new char[my_string.length()];
        for (int i = 0; i<my_string.length(); i++) {
            if (my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z') {
                arrAnswer[i] = Character.toUpperCase(my_string.charAt(i));
            } else {
                arrAnswer[i] = Character.toLowerCase(my_string.charAt(i));
            }
        }
        String answer = new String(arrAnswer);
        return answer;
    }
}