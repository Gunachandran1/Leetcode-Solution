class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n = strs.length;
        String ans = "";
        Arrays.sort(strs);

        for(int i = 0 ; i <=strs[0].length()-1 ; i++){

            char ele1 = strs[0].charAt(i);
            char ele2 = strs[n-1].charAt(i);
            if(ele1 == ele2) ans += ele1;
            else break;
        }
        return ans;
    }
}