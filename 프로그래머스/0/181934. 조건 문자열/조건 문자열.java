class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean bl = false;
        
        if (ineq.equals("<") && eq.equals("=")) {
            bl = n <= m;
        } else if (ineq.equals(">") && eq.equals("=")) {
            bl = n >= m;
        } else if (ineq.equals(">") && eq.equals("!")) {
            bl = n > m;
        } else if (ineq.equals("<") && eq.equals("!")) {
            bl = n < m;
        }
            
        return bl ? 1 : 0;
    }
}