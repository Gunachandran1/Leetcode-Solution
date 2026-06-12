class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0] , b[0]));

        int index = 0;
        for(int i = 1 ; i < intervals.length ; i++){

            if(intervals[i][0] <= intervals[index][1]){
                int maxi = Math.max(intervals[i][1],intervals[index][1]);
                
                if(maxi != intervals[index][1]) intervals[index][1] = maxi;
            }

            else{
                index ++;
                swap(index,i,intervals);
            }
        }

        return Arrays.copyOf(intervals,index+1);
    }

    void swap(int a , int b , int[][] arr){
    int[] temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
    }
}