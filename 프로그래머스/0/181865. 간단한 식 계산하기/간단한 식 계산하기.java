class Solution {
    public int solution(String binomial) {
        String[] sp = binomial.split(" "); 
        int a = Integer.parseInt(sp[0]);
        int b = Integer.parseInt(sp[2]);
        if (sp[1].equals("+")) {
            return a+b;
        } else if (sp[1].equals("-")) {
            return a-b;
        } else {
            return a*b;
        }
    }
}