class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i=0,j=0,freq=0;
        Arrays.sort(nums);
        while(j<nums.length){
            if(nums[i]==nums[j]){
                freq++;
                j++;
            }
            else{
                if(freq>1) return true;
                i=j;
                freq=0;
            }
        }
        if(freq>1) return true;
        return false;
        
    }
}