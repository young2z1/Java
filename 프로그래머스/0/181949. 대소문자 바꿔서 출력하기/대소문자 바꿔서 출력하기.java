import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        char[] arr = a.toCharArray();
        
        for (int i = 0; i<a.length(); i++) {
            if (65 <= arr[i] && arr[i] <= 90) {
                answer += Character.toLowerCase(arr[i]);
            } else if (97 <= arr[i] && arr[i] <= 122) {
                answer += Character.toUpperCase(arr[i]);
            }
        }
        System.out.print(answer);
    }
}