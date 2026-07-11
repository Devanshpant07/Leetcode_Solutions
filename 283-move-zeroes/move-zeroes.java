class Solution {
    public void moveZeroes(int[] arr) {
        int i=0,j=0;
        while(j<arr.length){
            if(arr[i]!=0 && arr[j]!=0){
                i++;
                j++;
            }
            else if(arr[i]==0 && arr[j]==0) j++;
            else if(arr[i]==0 && arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
        }
    
        
    }
}