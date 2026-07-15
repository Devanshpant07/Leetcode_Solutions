class Solution {
    public void duplicateZeros(int[] arr) {
       int[] arr2=new int[arr.length];
       int i=0,j=0;
       while(j<arr2.length){
        if(arr[j]!=0 && i<arr.length){
            arr2[i]=arr[j];
            i++;
        } 
        else{
            i=i+2;
        

        }
        j++;
       }
       for(int k=0;k<arr.length;k++){
        arr[k]=arr2[k];
       }
    
    }
        
}
