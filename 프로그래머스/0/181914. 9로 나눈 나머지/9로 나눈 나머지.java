class Solution {
    public int solution(String number) {
        String[] arr = number.split("");
        int n = 0;
        
        for (String s : arr) {
            n += Integer.parseInt(s);
        }
        
        return n%9;
    }
}