class Solution {
    public int trap(int[] height) {
        
        if(height.length <= 2) return 0;

        int[] lbArray = new int[height.length];
        lbArray[0] = height[0];
        int[] rbArray = new int[height.length];
        rbArray[height.length-1] = height[height.length-1];


        for(int i = 1 ; i < height.length-1 ; i++)
        {
            if(height[i] > lbArray[i-1])
            {
                lbArray[i] = height[i];
            }
            else
            {
                lbArray[i] = lbArray[i-1];
            }
        }

        // lbArray[height.length-1] = lbArray[height.length-2];   we dont checking last and first 

        for(int i = height.length-2 ; i >= 0 ; i--)
        {
            if(height[i] > rbArray[i+1])
            {
                rbArray[i] = height[i];
            }
            else
            {
                rbArray[i] = rbArray[i+1];
            }
        }

        // rbArray[0] = rbArray[1];    we dont check last and first (see below i , its starting from i and moving all the way till 2nd last element)


        // System.out.print(Arrays.toString(lbArray));
        // System.out.print(Arrays.toString(rbArray));

        long total = 0;

        for(int i = 1 ; i < height.length-1 ; i++)
        {
            int waterLevel = Math.min(lbArray[i],rbArray[i]);

            total += waterLevel - height[i];
        }
        
        return (int)total;
    }
}