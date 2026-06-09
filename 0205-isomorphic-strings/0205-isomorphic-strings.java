class Solution {
    public boolean isIsomorphic(String s, String t) {

        int sLen = s.length();
        int tLen = t.length();

        if(sLen != tLen) return false;
        
        int[] hash1 = new int[256];
        int[] hash2 = new int[256];

        for(int i = 0 ; i < sLen ; i++){

            int ele1 = s.charAt(i);
            int ele2 = t.charAt(i);

            if(hash1[ele1] != hash2[ele2]){
                return false;
            }

            hash1[ele1] = i+1;
            hash2[ele2] = i+1;
        }

        return true;
    }
}