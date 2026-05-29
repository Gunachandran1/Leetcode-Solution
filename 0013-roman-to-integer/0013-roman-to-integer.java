class Solution {
    public int romanToInt(String s) {
        
        int sum = 0;
        Map<Character,Integer> mpp = new HashMap<>();

        mpp.put('I',1);
        mpp.put('V',5);
        mpp.put('X',10);
        mpp.put('L',50);
        mpp.put('C',100);
        mpp.put('D',500);
        mpp.put('M',1000);

        for(int i = 0 ; i < s.length() ; i++){

            char ele = s.charAt(i);

            if(i+1 < s.length() && (mpp.get(s.charAt(i+1)) > mpp.get(ele))){
                sum += (mpp.get(s.charAt(i+1))) - mpp.get(ele);
                i++;
            }
            else{
                sum += mpp.get(s.charAt(i));
            }
        }

    return sum;
    }
}