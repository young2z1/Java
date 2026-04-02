import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] picture, int k) {
        // 결과를 저장할 리스트를 만듭니다. (크기가 유동적이므로 리스트가 편해요)
        List<String> answerList = new ArrayList<>();
        
        // 1. 기존 그림의 한 줄씩 꺼냅니다.
        for (String row : picture) {
            StringBuilder expandedRow = new StringBuilder();
            
            // 2. 한 줄 내의 각 문자를 k배로 늘립니다. (가로 확장)
            for (int i = 0; i < row.length(); i++) {
                char pixel = row.charAt(i);
                for (int j = 0; j < k; j++) {
                    expandedRow.append(pixel);
                }
            }
            
            // 3. 가로로 늘어난 줄을 k번 추가합니다. (세로 확장)
            for (int i = 0; i < k; i++) {
                answerList.add(expandedRow.toString());
            }
        }
        
        // 리스트를 다시 String 배열로 변환하여 반환합니다.
        return answerList.toArray(new String[0]);
    }
}