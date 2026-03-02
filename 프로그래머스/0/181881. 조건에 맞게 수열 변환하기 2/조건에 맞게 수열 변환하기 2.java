import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] com = new int[arr.length];
        
        while (!Arrays.equals(arr, com)) {
            com = Arrays.copyOf(arr, arr.length);
            answer++;
            for (int i = 0; i<arr.length; i++) {
                if (arr[i]>=50 && arr[i]%2==0) {    //50보다크거나작은 짝수
                    arr[i] = arr[i]/2;
                } else if (arr[i]<50 && arr[i]%2!=0) {  //50보다작은 홀수
                    arr[i] = arr[i]*2+1;
                }
            }
        }
        
        return answer-1;
    }
}