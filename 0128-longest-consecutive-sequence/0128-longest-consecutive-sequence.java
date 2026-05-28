class Solution {
    public int longestConsecutive(int[] arr) {
        
        int longest = 0;

        Set<Integer> st = new HashSet<>();
        for(int ele : arr){
            st.add(ele);
        }

        for(int ele : st){

            if(!st.contains(ele-1)){
                int count = 1;
                int x = ele;
                while(st.contains(x+1)){
                    count++;
                    x++;
                }

                if(count > longest) longest = count;
            }
        }

        return longest;
    }
}