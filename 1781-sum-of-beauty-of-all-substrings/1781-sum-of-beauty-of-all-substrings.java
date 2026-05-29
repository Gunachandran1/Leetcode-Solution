class Solution {
    public int findBeauty(int[] freq){

        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for(int ele : freq){
            if(ele > 0 && ele > maxi ) maxi = ele;
            if(ele > 0 && ele < mini) mini = ele;
        }
        if(mini == 0 || mini == 0) return 0; 
        return maxi - mini;
    }



    public int beautySum(String s) {

        int sum = 0;
        int n = s.length();
        for(int i = 0 ; i < n;i++){
            int[] arr = new int[26];
            for(int j = i ; j < n ; j++){
                int index = s.charAt(j) - 'a';
                arr[index] = arr[index]+1;

                sum += findBeauty(arr);

            }
            // System.out.println(Arrays.toString(arr));
        }

        return sum;
    }
}