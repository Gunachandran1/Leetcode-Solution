class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> mpp1 = new HashMap<>();
        Map<Character,Character> mpp2 = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){

            char ele1 = s.charAt(i);
            char ele2 = t.charAt(i);

            if(mpp1.containsKey(ele1) && mpp1.get(ele1) != ele2 
            || mpp2.containsKey(ele2) && mpp2.get(ele2) != ele1) 
            return false;

            mpp1.put(ele1,ele2);
            mpp2.put(ele2,ele1);
        }
        return true;

    }
}