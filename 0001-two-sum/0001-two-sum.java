class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j;
        int first = -1;
        int second = -1;
        int size = nums.length;
        
        while (i < size - 1)
        {   
            j = i + 1;
            
            while (j < size)
            {
                if(nums[i] + nums[j] == target)
                {
                    first = i;
                    second = j;
                    break;
                }

                j++;
            }
            if (first != -1 && second != -1)
                break;
            i++;
        }
        int a[] = {first, second};
        return a;
    }
   
}