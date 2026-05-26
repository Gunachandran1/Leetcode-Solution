class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> mpp = new HashMap<>();
        HashMap<Integer,Integer> mpp2 = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(!mpp.containsKey(nums[i])){
                mpp.put(nums[i],i);
            }
            else{
            mpp2.put(nums[i],i);
            }
        }
        Arrays.sort(nums);

        int i = 0 ; int j = nums.length-1;

        while(i < j){
            if(nums[i]+nums[j] == target){
                if(nums[i] == nums[j]){
                    
                    return new int[]{mpp.get(nums[i]) , mpp2.get(nums[i])};
                }
                return new int[]{mpp.get(nums[i]),mpp.get(nums[j])};
            }
            if(nums[i]+nums[j] > target) j--;
            else i++;
        }
    return new int[]{-1,-1};
    }
}