class Solution {
    public int myAtoi(String s) {

        // step 1
        s = s.trim();

        if(s.length() == 0) return 0;
        
        

        //step 2
        int sign = 1;
        int i = 0;

        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = (s.charAt(i)=='-') ? -1 : 1 ; 
            i++;
            }
        

        //step 3
        long num = 0;
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            num *= 10;
            num += s.charAt(i)-'0';
            // step 4
            if((num*sign) > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if((num*sign) < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);




        return (int)(num*sign); 
    }
}