class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;
        if(nums == null || n < 4) return new ArrayList();

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        int i = 0;
        while(i < n){
            while(i < n && i != 0 && nums[i] == nums[i-1]) i++;

            int j = i+1;

            while(j < n){
                while(j != (i+1) && j < n && nums[j] == nums[j-1]) j++;

                int k = j + 1;
                int l = n-1;
                while(k < l)
                {
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if(sum > target) l--;
                    else if(sum < target) k++;
                    else{
                        List<Integer> lst= new ArrayList<>();
                        lst.add(nums[i]);
                        lst.add(nums[j]);
                        lst.add(nums[k]);
                        lst.add(nums[l]);
                        set.add(lst);

                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && nums[l] == nums[l+1]) l--;    
                    }   
                }
                j++;
                
            }
            i++;
        }
        list.addAll(set);
        return list;
    }
}