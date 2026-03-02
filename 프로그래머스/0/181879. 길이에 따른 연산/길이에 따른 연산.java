class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length;
        int plus = 0;
        int mul = 1;
        
        for (int i : num_list) {
            plus += i;
        }
        for (int j : num_list) {
            mul *= j;
        }
        
        return (length >= 11) ? plus : mul;
    }
}