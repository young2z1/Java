class Solution {
    public int solution(int[] num_list) {
        String h = "";
        String j = "";
        
        for (int i : num_list) {
            if (i%2 == 0) {
                j += i;
            } else {
                h += i;
            }
        }
        
        return Integer.parseInt(j) + Integer.parseInt(h);
    }
}