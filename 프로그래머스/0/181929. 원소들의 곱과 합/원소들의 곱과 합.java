class Solution {
    public int solution(int[] num_list) {
        int star = 1;
        int plus = 0;
        
        for (int i : num_list) {
            star *= i;
            plus += i;
        }
        
        return (star < plus*plus) ? 1 : 0;
    }
}