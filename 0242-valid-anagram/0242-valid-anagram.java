class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int j = 0; 
        for(char i : arr1){
            if(i != arr2[j]) return false;
            j++;
        }
        return true;


    }
}