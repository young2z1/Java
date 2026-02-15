class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        int part = 0;
        
        for (String s : my_strings) {
            sb.append(s.substring(parts[part][0], parts[part][1]+1));
            part++;
        }
        
        return sb.toString();
    }
}