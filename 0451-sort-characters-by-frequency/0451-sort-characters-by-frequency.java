class Solution {
    public String frequencySort(String s) {
        
        Map<Character,Integer> mpp = new HashMap<>();
        String ans = "";

        for(int i = 0 ; i < s.length() ; i++){
            char ele = s.charAt(i);
            if(mpp.containsKey(ele)){
                mpp.put(ele,mpp.get(ele)+1);
            }
            else{
                mpp.put(ele,1);
            }
        }

        PriorityQueue<Character> q = new PriorityQueue<>( (a,b) -> mpp.get(b) - mpp.get(a) );

        for(char key : mpp.keySet()){
            q.add(key);
        }

        
        while(q.size() > 0){

            char ele = q.poll();

            for(int i = 0 ; i < mpp.get(ele) ; i++){
                ans+=ele;
            }
        }
        return ans;

    }
}