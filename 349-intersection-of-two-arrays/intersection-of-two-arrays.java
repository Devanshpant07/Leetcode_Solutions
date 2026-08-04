class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,check=-1;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]) i++;
            else if(nums2[j]<nums1[i]) j++;
            else{
                if(check!=nums1[i]){
                    arr.add(nums1[i]);
                    check=nums1[i];
                }
                i++;
                j++;

            }
        }
        int[] arr1 = new int[arr.size()]; 
        for (int k = 0; k < arr.size(); k++) {
            arr1[k] = arr.get(k);
        }       
        return arr1;
    }
}