class Solution {
    public List<Integer> majorityElement(int[] arr) {

        int ele1 = -1;
        int ele2 = -1;
        int cnt1 = 0;
        int cnt2 = 0;

        List<Integer> lst = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++){

            if(cnt1 == 0 && arr[i] != ele2){
                ele1 = arr[i];
                cnt1 ++;
            }
            else if(cnt2 == 0 && arr[i] != ele1){
                ele2 = arr[i];
                cnt2++;
            }
            else if(arr[i] == ele1){
                cnt1++;
            }
            else if(arr[i] == ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int ele : arr){
            if(ele == ele1) cnt1++;
            if(ele == ele2) cnt2++;
        }

        if(cnt1 > arr.length/3){
            lst.add(ele1);
        }
        if(ele1 != ele2){
            if(cnt2 > arr.length/3){
            lst.add(ele2);
        }
        }
        

        return lst;
    }
}