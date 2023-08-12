class Solution {
    public int jump(int[] nums) {
        int curmax = 0;
        int nextmax = 0;
        int n=nums.length;
        int jump = 0;
        for(int i = 0; i<n-1;i++){
            if(i+nums[i]>curmax){
                curmax=i+nums[i];
            }
            if(i==nextmax){
                jump++;
                nextmax = curmax;
            }
        }
        return jump;
    }
}