class Solution {

    public int findSmallestNumber(int[] arr,int maxi){
        int small = maxi;

        for(int ele : arr){
            if(ele < small) small = ele;
        }

        return small;
    }

    public int findLargestNumber(int[] arr){
        int max = 0;

        for(int ele : arr){
            if(ele > max) max = ele;
        }
        return max;
    }

    public int findGCD(int[] nums) {

        int largest = findLargestNumber(nums);

        int smallest = findSmallestNumber(nums,largest);

        while(largest != 0 && smallest != 0){

            if(largest > smallest){
                largest = largest % smallest;
            }
            else{
                smallest = smallest % largest;
            }
        }

        return (largest == 0) ? smallest : largest;

    }
}