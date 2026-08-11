class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length==1){
            return nums[0]+1;
        }
        int sum=nums[0];
        int i;
        for( i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];

            }
            else{
                break;

            }
        }
        // int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int j=0;j<nums.length;j++){
            set.add(nums[j]);
        }  
        while(true){
            if(set.contains(sum)){
                sum+=1;

            }
            else{
                break;

            }
        } 
        return sum;     

        
    }
}