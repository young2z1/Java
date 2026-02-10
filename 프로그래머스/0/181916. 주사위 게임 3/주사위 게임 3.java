import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];
        d = arr[3];
        
        return a == d ? 1111 * a : // 모두 같음  
               b == d ? (10*b+a) * (10*b+a) : // a만 다를 때
               a == c ? (10*b+d) * (10*b+d) : // d만 다를 때
               a == b && c == d? (a+c) * Math.abs(a-c) : // 둘둘
               a == b ? c*d : // a == b
               b == c ? a*d : // b == c
               c == d ? a*b : // c == d
               a;
    }
}