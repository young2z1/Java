class Solution {
    public int solution(int[] date1, int[] date2) {
        String sdate1 = "" + date1[0] + date1[1] + date1[2];
        String sdate2 = "" + date2[0] + date2[1] + date2[2];
        
        return (Integer.parseInt(sdate1) < Integer.parseInt(sdate2)) ? 1 : 0;
    }
}