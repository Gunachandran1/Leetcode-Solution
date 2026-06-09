class Solution {
    public int beautySum(String s) {
        
        int sum = 0;

        for(int i = 0 ; i < s.length() ; i++){
            
            int[] hash = new int[26];
            int max = 0;
            for(int j = i ; j < s.length() ; j++){
                
                hash[s.charAt(j)-'a']++;

                max = Math.max(max,hash[s.charAt(j)-'a']);

                int min = Integer.MAX_VALUE;
                

                for(int ele : hash){
                    if(ele != 0 && ele < min) min = ele;
                }
                if(min != Integer.MAX_VALUE)
                sum += (max-min);
                
            }
        }

        return sum;
    }
}