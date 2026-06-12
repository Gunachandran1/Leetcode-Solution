class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0] , b[0]));

        List<int[]> lst = new ArrayList<>();
        
        for(int[] interval : intervals){

            if(lst.isEmpty()) lst.add(interval);

            else if(interval[0] <= lst.get(lst.size()-1)[1])
            {
                int st = interval[0];
                int end = interval[1];
                int maxi = Math.max(end,lst.get(lst.size()-1)[1]);
                lst.get(lst.size()-1)[1] = maxi;
            }
            else{
                lst.add(interval);
            }

        }

        return lst.toArray(new int[lst.size()][]);
    }
}