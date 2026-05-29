class Solution {
    public String frequencySort(String s) {

        StringBuilder sb = new StringBuilder();
        
        Map<Character,Integer> mpp = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            
            char ele = s.charAt(i);
            if(mpp.containsKey(ele)) mpp.put(ele,mpp.get(ele)+1);
            else mpp.put(ele,1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> mpp.get(b) - mpp.get(a));

        for(char key : mpp.keySet()){
            pq.add(key);
        }
        System.out.println(pq);

        while(pq.size() > 0){

            char ele = pq.poll();

            for(int i = 0 ; i < mpp.get(ele) ; i++) sb.append(ele);
        }

        return sb.toString();
    }
}