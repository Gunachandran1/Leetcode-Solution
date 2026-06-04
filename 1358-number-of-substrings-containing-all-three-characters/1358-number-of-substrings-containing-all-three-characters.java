class Solution {
    public int numberOfSubstrings(String s) {
        
        int n = s.length();
        int count = 0;

        int[] arr = new int[3];

        for(int  k = 0 ; k < 3 ; k++){
            arr[k] = -1;
        }
        
        for(int r = 0 ; r < n ; r++){

            arr[s.charAt(r)-'a'] = r;

            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
                int min = Math.min(arr[0],Math.min(arr[1],arr[2]));

                count += (min+1);
            }

        }



        return count;

    }
}