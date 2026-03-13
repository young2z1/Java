import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a-c]+", " ").trim();
        String[] em = {"EMPTY"};
        String[] st = myStr.split(" ");
        
        if (st[0].equals("")) {
            return em;
        } else {
            return st;
        }
    }
}