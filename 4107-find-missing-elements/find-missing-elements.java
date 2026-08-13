class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int first=nums[0],last=nums[n-1],j=0;
        for(int i=first;i<last;i++){
            if(i==nums[j]) j++;
            else if(i<nums[j]){
                arr.add(i);
            }

        }
        return arr;
        
    }
}