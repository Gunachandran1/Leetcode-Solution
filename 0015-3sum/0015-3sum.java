class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        List<List<Integer>> lst = new ArrayList<>();

        Arrays.sort(arr);
        
        for(int i = 0 ; i < arr.length ; i++){

            if(i > 0){
                if(arr[i] == arr[i-1]) continue;
            }
            int j = i+1;
            int k = arr.length - 1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0){
                    List<Integer> temp = Arrays.asList(arr[i],arr[j++],arr[k--]);
                    lst.add(temp);
                    while(j < k && arr[j] == arr[j-1]) j++;
                    while(j < k && arr[k] == arr[k+1]) k--;
                }
                else if(sum > 0){
                    k--;
                }
                else j++;
            }
        }

        return lst;
    }
}