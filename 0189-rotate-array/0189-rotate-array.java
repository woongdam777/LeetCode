class Solution {
       public void rotate(int[] nums, int k) {

        int n=nums.length; 
        if(k>n) k=k%n;

        int r=n-k;
        int arr[]=new int[n];
        int i=0;

        while(r<n){ arr[i++]=nums[r++]; }

        r=n-k;
        int j=0; 
        while(j<r){ arr[i++]=nums[j++]; }    
           
        for(int x=0;x<n;x++) nums[x]=arr[x];
    }
}