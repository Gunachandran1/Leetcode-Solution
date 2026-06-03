class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] strArr = s.split(" ");
        if(strArr.length != pattern.length()) return false;

        HashMap<Character,String> hmp1 = new HashMap<>();
        HashMap<String,Character> hmp2 = new HashMap<>();

        for(int i = 0 ; i < pattern.length() ; i++){
            char ele = pattern.charAt(i);

            if(hmp1.containsKey(ele) && (!hmp1.get(ele).equals(strArr[i])) ||
                hmp2.containsKey(strArr[i]) && (!hmp2.get(strArr[i]).equals(ele)))
                return false;

            hmp1.put(ele,strArr[i]);
            hmp2.put(strArr[i],ele);

        }

        return true;
    }
}