class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

        int[] countArr = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            int value1 = s.charAt(i) - 'a';
            int value2 = t.charAt(i) - 'a';
            countArr[value1]++;
            countArr[value2]--;
        }

        for(int ele : countArr){
            if(ele != 0) return false;
        }

        return true;
    
    }
}