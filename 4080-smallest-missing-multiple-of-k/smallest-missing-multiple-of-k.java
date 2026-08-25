class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int i=k;
       
        while(true){
            if(!set.contains(k)){
                return k;

            }
            k=k+i;
            

           

            
        }
        
    }
}