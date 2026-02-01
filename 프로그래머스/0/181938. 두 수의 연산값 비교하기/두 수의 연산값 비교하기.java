class Solution {
    public int solution(int a, int b) {
        String strPlus = ""+a+b;
        String strStar = ""+(2*a*b);
        int intPlus = Integer.parseInt(strPlus);
        int intStar = Integer.parseInt(strStar);
        int answer = (intPlus >= intStar) ? intPlus : intStar;
        return answer;
    }
}