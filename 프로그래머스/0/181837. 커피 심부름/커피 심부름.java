class Solution {
    public int solution(String[] order) {
        int ame = 0;
        int caf = 0;
        
        for (String s : order) {
            if (s.contains("americano") || s.contains("anything")) ame++;
            else caf++;
        }
        
        return ame*4500 + caf*5000;
    }
}