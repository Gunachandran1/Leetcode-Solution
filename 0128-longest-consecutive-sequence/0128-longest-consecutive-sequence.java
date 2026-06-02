class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        int maxCount = 0;

        for(int ele : nums){
            st.add(ele);
        }

        for(int ele : st){

            if(!st.contains(ele-1)){
                int x = ele;
                int count = 1;
                while(st.contains(x+1)){
                    count++;
                    x++;
                }
                if(count>maxCount) maxCount = count;
            }
    }
    return maxCount;
    }
}