class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int n=nums.length;
        int max = 0;
        int result = 0;
        for(int i = 0; i<n-1;i++){
            if(i+nums[i]>max){
                max=i+nums[i];
            }
            if(i==count){
                result++;
                count = max;
            }
        }
        return result;
    }
}