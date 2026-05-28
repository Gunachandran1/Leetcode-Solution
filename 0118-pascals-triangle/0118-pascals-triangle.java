class Solution {
    public List<List<Integer>> generate(int n) {
        
        List<List<Integer>> lst = new ArrayList<>();



        for(int i = 1 ; i <= n ; i++){
            int ans = 1;
            List<Integer> lst1 = new ArrayList<>();
            lst1.add(ans);

            for(int j = 1 ; j <i ; j++){
                ans *= (i-j);
                ans /= j;
                lst1.add(ans);          
            }
            lst.add(lst1);

        }
        return lst;

    }
}