class Solution {
    public int[] solution(int[] num_list) {
        int numj = 0;
        int numh = 0;
        for (int i : num_list) {
            if (i % 2 == 0) {
                numj++;
            } else {
                numh++;
            }
        }
        int[] answer = {numj, numh};
        return answer;
    }
}