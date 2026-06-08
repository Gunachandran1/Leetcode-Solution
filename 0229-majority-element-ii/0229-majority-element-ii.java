class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int ele1 = Integer.MIN_VALUE;
        int ele2 = 0;
        int count1 = 0;
        int count2 = 0;
        List<Integer> lst = new ArrayList<>();

        for(int ele : nums){

            if(count1 == 0 && ele != ele2) {ele1 = ele; count1++;}
            else if(count2 == 0 && ele != ele1) {ele2 = ele; count2++;}

            else if(ele == ele1) count1++;
            else if(ele == ele2) count2++;

            else{count1--; count2--;}
        }

        count1 = 0;
        count2 = 0;

        for(int ele : nums){
        if(ele == ele1) count1++;
        if(ele == ele2) count2++;
        }

        if(count1 > (nums.length / 3)) lst.add(ele1);
        if(count2 > (nums.length / 3)) lst.add(ele2);

        return lst;


    }
}