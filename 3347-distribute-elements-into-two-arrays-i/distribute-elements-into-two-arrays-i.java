class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int [n];
        int[] result=new int[n];
        int ele1=0;
        int ele2=0;
        int ele3=0;
        arr1[ele1]=nums[0];
        arr2[ele2]=nums[1];
        for(int i=2;i<n;i++){
            if(arr1[ele1]>arr2[ele2]){
                ele1++;
                arr1[ele1]=nums[i];
            }
            else{
                ele2++;
                arr2[ele2]=nums[i];
            }
        }
        for(int ele : arr1){
            if(ele!=0){
                result[ele3++]=ele;
            }
            

        }
          for(int ele : arr2){
             if(ele!=0){
                result[ele3++]=ele;
            }

        }
        return result;

        
    }
}