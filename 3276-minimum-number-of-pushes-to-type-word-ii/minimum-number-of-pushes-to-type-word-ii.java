class Solution {
    public int minimumPushes(String word) {
        int[] arr=new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        int ans=0;
        int k=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0){
                break;
            }
            ans+=((k/8)+1)*arr[i];
            k++;

        }
        return ans;
        
    }
}