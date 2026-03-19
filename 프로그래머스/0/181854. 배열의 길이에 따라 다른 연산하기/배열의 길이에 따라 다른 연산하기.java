class Solution {
    public int[] solution(int[] arr, int n) {
        if (arr.length%2==0) {
            for (int h = 1; h<arr.length;) {
                arr[h] = arr[h]+n;
                h+=2;
            }
        } else {
            for (int j = 0; j<arr.length;) {
                arr[j] = arr[j]+n;
                j+=2;
            }
        }
        
        return arr;
    }
}