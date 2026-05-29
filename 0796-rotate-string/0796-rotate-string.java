class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;
        
        String newStr = s+s;

        return newStr.contains(goal);
    }
}