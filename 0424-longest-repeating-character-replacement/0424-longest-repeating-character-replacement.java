class Solution {
    public int characterReplacement(String s, int k) {
        

        int i = 0;
        int j = 0;
        int n = s.length();
        HashMap<Character,Integer> mpp = new HashMap<>();
        int maxi =0;
        int maxFreq =0;

        while(j < n){

            char ch = s.charAt(j);

            if(!mpp.containsKey(ch)) mpp.put(ch,1);
            else mpp.put(ch,mpp.get(ch)+1);
            maxFreq = Math.max(maxFreq,mpp.get(ch));


            if(((j - i + 1) - maxFreq) > k){
                mpp.put(s.charAt(i),mpp.get(s.charAt(i))-1);
                if(mpp.get(s.charAt(i)) == 0) mpp.remove(s.charAt(i));
                i++;
            }


            int len = j - i + 1;
            if(len > maxi) maxi = len;
            j++;
        }

        return maxi;
    }
}