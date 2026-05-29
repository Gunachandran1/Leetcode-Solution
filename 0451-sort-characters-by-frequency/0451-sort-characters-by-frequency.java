class Solution {
    public String frequencySort(String s) {
        
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> mpp = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            
            if(mpp.containsKey(ch)) mpp.put(ch,mpp.get(ch)+1);
            else mpp.put(ch,1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>( (a,b) -> mpp.get(b) - mpp.get(a));

        for(char key : mpp.keySet()){
            pq.add(key);
        }

        while(pq.size() > 0){

            char ch = pq.poll();

            for(int i = 0 ; i < mpp.get(ch) ; i++){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}