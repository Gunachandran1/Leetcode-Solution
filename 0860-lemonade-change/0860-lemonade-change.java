class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five = 0;
        int ten = 0;

        for(int ele : bills){
            if(ele == 5)five++;
            else if(ele == 10){
                if(five > 0){
                    five--;
                    ten++;
                }
                else return false;
            }
            else{
                if(five >=3 || ten > 0){
                    if(five >=1 && ten > 0) {
                        five -= 1;
                        ten -= 1;
                    }
                    else if(five >= 3){
                        five -= 3;
                    }
                    else return false;
                    
                }
                else return false;
            }
        }
        return true;
    }
}