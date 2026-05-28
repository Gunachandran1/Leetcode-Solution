class Solution {
    public int majorityElement(int[] arr) {
        
        // Moore's voting algorithm
        int count = 0;
        int ele = -1;

        for(int i = 0 ; i < arr.length ; i++){

            if(count == 0)
            {
                ele = arr[i];
            }

            if(ele == arr[i]){
                count++;
            }
            else{
                count--;
            }

        }

        int finalCnt = 0;
        for(int elem : arr){
            if(ele == elem) finalCnt ++;
        }
        if(finalCnt > arr.length/2)
        {
            return ele;
        }
        return -1;

    }
}