class Solution {
    public int romanToInt(String s) {

        Map<Character,Integer> mpp = new HashMap<>();
        int num = 0;

        mpp.put('I',1);
        mpp.put('V',5);
        mpp.put('X',10);
        mpp.put('L',50);
        mpp.put('C',100);
        mpp.put('D',500);
        mpp.put('M',1000);


        for(int i = 0 ; i < s.length() ; i++){

            char curCh = s.charAt(i);

            if((i+1 < s.length()) && (mpp.get(s.charAt(i+1))) > mpp.get(curCh)){
                num += (mpp.get(s.charAt(i+1)) - mpp.get(curCh));
                i++;
            }
            else{
                num += mpp.get(curCh);
            }
        }
        return num;

    }
}