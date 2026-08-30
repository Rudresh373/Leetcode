class Solution {
    public int minimumDeletions(int[] nums) {
         int n=nums.length;
        int maxidx=-1;
        int minidx=-1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                maxidx=i;
                max=nums[i];
            }
            if(nums[i]<min){
                minidx=i;
                min=nums[i];
            }
        }
        //for front
        int front=Math.max(maxidx,minidx)+1;
        int last=Math.max(n-maxidx,n-minidx);
        int mid=-1;

        if(maxidx<minidx){
            mid=maxidx+1+(n-minidx);
        }
        else{
            mid=minidx+1+(n-maxidx);
        }

        return Math.min(front,Math.min(last,mid));
        
       
        
        
    }
}