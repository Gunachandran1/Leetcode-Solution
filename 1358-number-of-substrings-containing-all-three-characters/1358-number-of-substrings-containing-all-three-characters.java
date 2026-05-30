class Solution {
    public int numberOfSubstrings(String s) {
        
        int count = 0;

        int l = 0 , n = s.length();
        int[] arr = new int[3];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = -1;
        }

        while(l < n){

            arr[s.charAt(l)-'a'] = l;

            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
               int firstMini = Math.min(arr[0],arr[1]);
               int mini = Math.min(firstMini,arr[2]);         

               count += 1+mini;
            }
            
            l++;
        }

        return count;
    }
}