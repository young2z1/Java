class Solution {
    public int solution(int[] numbers, int k) {
        int idx = 2*k-2;
        if (idx > numbers.length-1) idx = idx-idx/numbers.length*numbers.length;

        return numbers[idx];
    }
}