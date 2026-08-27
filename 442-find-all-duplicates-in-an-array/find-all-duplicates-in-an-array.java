class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]<0) arr.add(Math.abs(nums[i]));
            else nums[idx]=-nums[idx];

        }
        return arr;
        
    }
}