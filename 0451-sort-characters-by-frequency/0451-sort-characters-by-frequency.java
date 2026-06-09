class Solution {
    public String frequencySort(String s) {
        
        Map<Character,Integer> mpp = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char item = s.charAt(i);
            if(!mpp.containsKey(item)) mpp.put(item,1);
            else mpp.put(item,mpp.get(item)+1);
        }

        List<Character> lst = new ArrayList<>(mpp.keySet());

        lst.sort((a,b) -> (mpp.get(b) - mpp.get(a)));

        StringBuilder sb = new StringBuilder();
        

        for(char item : lst){
            for(int i = 0 ; i < mpp.get(item) ; i++)
            {
                sb.append(item);
            }
        }
        return sb.toString();
    }
}