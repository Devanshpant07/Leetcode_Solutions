class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=0;
        while(j<nums.length){
            while(j<nums.length && nums[i]==nums[j]) j++;
            if(j-i>nums.length/2) return nums[i];
            i=j;
        }
        return 0;
        
    }
}