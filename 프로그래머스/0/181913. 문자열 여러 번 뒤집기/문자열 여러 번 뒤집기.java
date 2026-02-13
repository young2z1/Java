class Solution {
    public String solution(String my_string, int[][] queries) {
        // 1. 수정을 위해 StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            
            // 2. 뒤집을 부분만 쏙 골라내기 (end + 1 주의!)
            String target = sb.substring(start, end + 1);
            
            // 3. 골라낸 부분 뒤집기
            StringBuilder reversed = new StringBuilder(target).reverse();
            
            // 4. 원본의 해당 위치를 뒤집힌 문자열로 통째로 갈아끼우기
            sb.replace(start, end + 1, reversed.toString());
        }
        
        // 5. 최종 결과를 String으로 변환해서 반환
        return sb.toString();
    }
}