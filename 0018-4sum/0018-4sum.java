class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        

        Arrays.sort(nums);
        
        Set<List<Integer>> set = new HashSet<>();

        int first = 0;
        int n = nums.length;

        while(first < n){
            while(first != 0 && first < n && nums[first] == nums[first-1]) first++;

            int second = first + 1;
            while(second < n){
                
                while((second != (first + 1)) && second < n && nums[second] == nums[second -1]) second++;

                int third = second + 1;
                int fourth = n - 1;

                while(third < fourth){

                    long sum = nums[first] + nums[second];
                    sum += nums[third] ;
                    sum += nums[fourth];

                    if(sum == target){
                        List<Integer> lst = new ArrayList<>();

                        lst.add(nums[first]);
                        lst.add(nums[second]);
                        lst.add(nums[third]);
                        lst.add(nums[fourth]);

                        set.add(lst);
                        third++;
                        fourth--;

                        while(third < fourth && nums[third] == nums[third-1]) third++;
                        while(third < fourth && nums[fourth] == nums[fourth+1]) fourth--;
                    }

                    else if(sum < target) third++;
                    else fourth --;

                }
                second++;

            }
            first++;
        }


        List<List<Integer>> list = new ArrayList<>();

        list.addAll(set);

        return list;
    }
}