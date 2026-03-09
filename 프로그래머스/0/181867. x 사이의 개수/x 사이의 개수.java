class Solution {
    public int[] solution(String myString) {     
        if (myString.charAt(myString.length()-1) == 'x') myString+=" ";
        String[] sp = myString.split("x");
        int[] answer = new int[sp.length];
        
        for (int i = 0; i<sp.length; i++) {
            answer[i] = sp[i].replace(" ", "").length();
        }
        
        return answer;
    }
}