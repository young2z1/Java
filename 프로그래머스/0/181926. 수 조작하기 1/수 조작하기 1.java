class Solution {
    public int solution(int n, String control) {
        String[] arrCont = control.split("");
        
        for (String s : arrCont) {
            if (s.equals("w")) {
                n += 1;
            } else if (s.equals("s")) {
                n -= 1;
            } else if (s.equals("d")) {
                n += 10;
            } else if (s.equals("a")) {
                n -= 10;
            }
        }
        
        return n;
    }
}