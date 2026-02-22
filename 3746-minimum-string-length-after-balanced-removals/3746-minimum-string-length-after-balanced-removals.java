class Solution {
    public int minLengthAfterRemovals(String s) {
        
        int aCnt = 0;
        int bCnt = 0;

        for(int i = 0 ; i < s.length() ; i++)
            {
                if(s.charAt(i)=='a')aCnt++;
                else bCnt++;
            }
        return Math.abs(aCnt-bCnt);
    }
}