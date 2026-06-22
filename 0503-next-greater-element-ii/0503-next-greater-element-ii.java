class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;

        int[] arr = new int[n];
        int ind = n-1;

        Stack<Integer> st = new Stack<>();

        for(int i = (2*n)-1 ; i >= 0 ; i--)
        {
            int index = i%n;
            while(!st.empty() && st.peek() <= nums[index]){
                st.pop();
            }
            if(i < n){
                if(!st.empty()) arr[ind--] = st.peek();
                else arr[ind--] = -1;
            }

            st.push(nums[index]);
        }


        return arr;
    }
}