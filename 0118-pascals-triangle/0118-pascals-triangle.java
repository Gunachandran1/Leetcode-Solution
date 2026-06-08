class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<>();
    
        

        for(int outer = 1 ; outer <= numRows ; outer++)
        {
            List<Integer> lst = new ArrayList<>();
            int sum = 1;
            lst.add(sum);
            for(int i = 1 ; i <outer ; i++){
                sum *= (outer-i);
                sum /= i;
                lst.add(sum);
            }
            list.add(lst);
        }
        

        return list;
    }
}