class Solution {
    public boolean isAnagram(String s, String t) {

        int sLen = s.length();
        int tLen = t.length();

        if(sLen != tLen) return false;
        
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i = 0 ; i < sLen ; i++){
            if(arr1[i] != arr2[i]) return false;
        }

        return true;
    }
}