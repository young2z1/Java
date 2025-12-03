class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int answer_i = 0;   //answer 인덱스
        for (int i=num_list.length-1; i>=0; i--) {
            answer[answer_i] = num_list[i];
            answer_i++;
        }
        return answer;
        
        
    }
}