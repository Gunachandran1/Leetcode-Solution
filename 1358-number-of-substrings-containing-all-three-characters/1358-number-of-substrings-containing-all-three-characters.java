class Solution {
    public int numberOfSubstrings(String s) {
        
        int count= 0;
        int i = 0;
        int n = s.length();
        int[] hash = new int[3];
        for(int k = 0 ; k < 3 ; k++){
            hash[k] = -1;
        }
        while(i < n)
        {
            char currCh = s.charAt(i);
            hash[currCh - 'a'] = i;

            if(hash[0]!=-1 && hash[1]!=-1 && hash[2]!=-1){

                int min = Math.min(hash[0],Math.min(hash[1],hash[2]));
                count += (min+1);
            }
            i++;
        }


        return count;
    }
}