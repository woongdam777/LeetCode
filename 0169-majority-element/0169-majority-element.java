class Solution {
    public int majorityElement(int[] nums) {
        int sum = 1;
        int result = nums[0];
        for(int i = 1; i < nums.length -1; i++){
            if(nums[i] == result){
                sum = sum +1;
            } else {
                sum = sum -1;
            }
            if(sum == 0){
                result = nums[i+1];
            }
        }
        return result;
    }
}