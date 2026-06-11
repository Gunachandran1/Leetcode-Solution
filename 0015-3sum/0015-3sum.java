class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> setOfList = new HashSet<>();

        

        for(int i = 0 ; i < nums.length-1 ; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i+1 ; j < nums.length ; j++){
                
                int k = - (nums[i] + nums[j]);
                if(!set.isEmpty() && set.contains(k)){
                    ArrayList<Integer> lst = new ArrayList<>();
                    lst.add(nums[i]);
                    lst.add(nums[j]);
                    lst.add(k);
                    Collections.sort(lst);
                    setOfList.add(lst);
                    
                }
                set.add(nums[j]);
            }
        }

        List<List<Integer>> list = new ArrayList<>();
        list.addAll(setOfList);

        return list;
    }
}