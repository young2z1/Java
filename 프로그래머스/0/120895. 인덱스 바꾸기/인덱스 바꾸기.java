class Solution {
    public String solution(String my_string, int num1, int num2) {
        char c1 = my_string.charAt(num1);
        char c2 = my_string.charAt(num2);
        String[] arrStr = my_string.split("");
        arrStr[num1] = String.valueOf(c2);
        arrStr[num2] = String.valueOf(c1);
        return String.join("", arrStr);
    }
}