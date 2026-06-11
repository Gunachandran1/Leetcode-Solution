class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        int i = 0;
        
        while(i < nums.length ){
            while(i!=0 && (i < nums.length && nums[i] == nums[i-1])) i++;
            int j = i+1;
            int k = nums.length-1 ;
            while(j < k){

                if((nums[i] + nums[j] + nums[k]) > 0)
                {
                    k--;
                }
                else if((nums[i] + nums[j] + nums[k]) < 0) j++;
                else {
                    ArrayList<Integer> lst = new ArrayList<>();
                    lst.add(nums[i]);
                    lst.add(nums[j]);
                    lst.add(nums[k]);
                    list.add(lst);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;

                }
            }

            i++;
        }
        return list;
    }
}