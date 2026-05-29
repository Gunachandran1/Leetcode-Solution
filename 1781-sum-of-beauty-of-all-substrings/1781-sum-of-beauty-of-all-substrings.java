class Solution {
    public int findMini(int[] freq){
        int mini = Integer.MAX_VALUE;

        for(int ele : freq){
            if(ele > 0) mini = Math.min(mini,ele);
        }

        return mini;
    }

    public int beautySum(String s) {
        if(s.length() == 0 || s==null || s.length() == 1) return 0;
        int sum = 0;
        int n = s.length();

        for(int i = 0 ; i < n ; i++){
            int[] freq = new int[26];
            int maxi = Integer.MIN_VALUE;
            
            for(int j = i ; j < n ; j++){
                
                int index = s.charAt(j)-'a';
                freq[index]++;

                maxi = Math.max(maxi,freq[index]);

                

                sum += (maxi - findMini(freq));
            }
        }


        return sum ;
    }
}