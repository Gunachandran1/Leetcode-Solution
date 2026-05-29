class Solution {
    public int maxDepth(String s) {
        
        int maxi = 0;
        int curCnt = 0;

        for(int i = 0 ; i < s.length() ; i++){
            
            char ele = s.charAt(i);

            if(ele == '('){
                curCnt++;
                if(curCnt > maxi) maxi = curCnt;
            }
            else if(ele == ')') curCnt--;
        }
        return maxi;
    }
}