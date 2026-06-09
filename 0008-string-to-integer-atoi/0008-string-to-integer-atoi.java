class Solution {
    public int myAtoi(String s) {
        
        // if(s == null || s.length() == 0) return 0;
// 
        s = s.trim();

        if(s.length() == 0) return 0;

        int index = 0;
        int sign = 1;

        if(s.charAt(index) == '-' || s.charAt(index) == '+'){
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        long val = 0;
        while(index < s.length() && Character.isDigit(s.charAt(index))){
            val *= 10;
            val += s.charAt(index)-'0';
            index++;
            if((val*sign) > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if((val*sign) < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int)val*sign;
        
    }
}