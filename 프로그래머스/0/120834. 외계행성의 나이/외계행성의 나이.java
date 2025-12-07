class Solution {
    public String solution(int age) {
        String[] arrAl = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String strAge = String.valueOf(age); //int를 String으로 변환 - age
        String[] arrAge = strAge.split(""); //인덱스로 사용 위해 String[]로 변환 - age
        String[] arrAnswer = new String[arrAge.length]; // 답을 넣을 answer[]
        
        for (int i = 0; i < arrAge.length; i++) {
            int intIdx = Integer.parseInt(arrAge[i]);
            arrAnswer[i] = arrAl[intIdx];
        }
        return String.join("", arrAnswer);
    }
}