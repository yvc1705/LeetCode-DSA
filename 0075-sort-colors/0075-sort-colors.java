class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        for (int i =0 ; i<n-1; i++)
        {
            int minm;
            minm = i;
            for(int j = i+1; j<n; j++)
            {
                if (nums[j] < nums[minm])
                minm = j;
            }

            int temp = nums[minm];
            nums[minm] = nums[i];
            nums[i] = temp;
        }
    }
}