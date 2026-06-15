class Solution {
    public int totalFruit(int[] fruits) {
        
        int i = 0;
        int j = 0;
        int  maxi = 0;

        int n = fruits.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();

        while(j < n){

            if(!mpp.containsKey(fruits[j])) mpp.put(fruits[j],1);
            else mpp.put(fruits[j],mpp.get(fruits[j])+1);

            while(mpp.size() > 2){
                mpp.put(fruits[i],mpp.get(fruits[i])-1);
                if(mpp.get(fruits[i]) == 0) mpp.remove(fruits[i]);
                i++;
            }

            int len = j - i + 1;
            if(len > maxi) maxi = len;
            


            j++;
        }

        return maxi;
    }
}