class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int intA = Integer.parseInt(strA+strB);
        int intB = Integer.parseInt(strB+strA);
        if (intA >= intB) {
            answer = intA;
        } else {
            answer = intB;
        }
        return answer;
    }
}