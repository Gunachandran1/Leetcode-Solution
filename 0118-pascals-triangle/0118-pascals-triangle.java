class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> mainLst = new ArrayList<>();

        for(int i = 1 ; i <=numRows ; i++){
            List<Integer> lst = new ArrayList<>();
            int ans = 1;
            lst.add(ans);
            
            for(int st = 1 ; st < i ; st++){
                ans *= (i-st);
                ans /= st;
                lst.add(ans);
            }

            mainLst.add(lst);
        }
        return mainLst;
    }
}