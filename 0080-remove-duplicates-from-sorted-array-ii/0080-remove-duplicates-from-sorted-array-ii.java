class Solution {
    public int removeDuplicates(int[] nums) {
        int flag = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i-1] == nums[i])  flag++;
            else flag = 1;
            
            if (flag <= 2)nums[count++] = nums[i];
        }
        return count;
    }
}