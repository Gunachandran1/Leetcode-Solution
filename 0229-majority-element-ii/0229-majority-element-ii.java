class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int ele1 = Integer.MIN_VALUE , ele2 = 0, cnt1 = 0 , cnt2 = 0 , n = nums.length;

        List<Integer> lst = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){

            if(cnt1 == 0 && ele2 != nums[i]){ele1 = nums[i]; cnt1++;}
            else if(cnt2 == 0 && ele1 != nums[i]){ele2 = nums[i]; cnt2++;}

            else if(nums[i] == ele1) cnt1++;
            else if(nums[i] == ele2) cnt2++;

            else {cnt1--; cnt2--;}
        }

        cnt1 = 0 ; cnt2 = 0;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] == ele1)cnt1++;
            if(nums[i] == ele2)cnt2++;
        }

        if(cnt1 > (n/3)) lst.add(ele1);
        if(cnt2 > (n/3)) lst.add(ele2);

        return lst;
    }
}