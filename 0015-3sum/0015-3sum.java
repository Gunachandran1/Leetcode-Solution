class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        
        List<List<Integer>> finalLst = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        

        for(int i = 0 ; i < arr.length ; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i+1 ; j < arr.length ; j++){
                int find = (arr[i]+arr[j]) * -1;
                if(set.contains(find)){
                List<Integer> lst = new ArrayList<>();
                lst.add(arr[i]);
                lst.add(arr[j]);
                lst.add(find);
                Collections.sort(lst);
                st.add(lst);
                }
                set.add(arr[j]);
                
            }

        }
        finalLst.addAll(st);
        return finalLst;
    }
}