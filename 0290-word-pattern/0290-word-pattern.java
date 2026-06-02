class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] wordArr = s.split(" ");

        if(wordArr.length != pattern.length()) return false;

        HashMap<Character,String> mpp1 = new HashMap<>();
        HashMap<String,Character> mpp2 = new HashMap<>();

        for(int i = 0 ; i < pattern.length() ; i++){

            char ele = pattern.charAt(i);
            String word = wordArr[i];

            if(mpp1.containsKey(ele) && (!mpp1.get(ele).equals(word))
            || mpp2.containsKey(word) && (!mpp2.get(word).equals(ele)))
            return false;

            mpp1.put(ele,word);
            mpp2.put(word,ele);
        }
        return true;

    }
}