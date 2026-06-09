class Solution {
    public boolean isAnagram(String s, String t) {

        int sLen = s.length();
        int tLen = t.length();

        if(sLen != tLen) return false;
        
        int[] hash = new int[26];

        for(int i = 0 ; i < sLen ; i++){

            hash[s.charAt(i)-'a']++;
            hash[t.charAt(i)-'a']--;
        }

        for(int ele : hash){
            if(ele != 0) return false;
        }

        return true;
    }
}