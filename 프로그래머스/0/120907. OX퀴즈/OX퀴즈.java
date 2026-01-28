class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i<quiz.length; i++) {
            String[] aS = quiz[i].split(" ");
            if (aS[1].equals("+")) {
                if (Integer.parseInt(aS[0]) + Integer.parseInt(aS[2]) == Integer.parseInt(aS[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (Integer.parseInt(aS[0]) - Integer.parseInt(aS[2]) == Integer.parseInt(aS[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;        
        
    }
}