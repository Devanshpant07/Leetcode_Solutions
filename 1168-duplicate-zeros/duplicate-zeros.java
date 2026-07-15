class Solution {
    public void duplicateZeros(int[] arr) {
        int j=0;
        while(j<arr.length){
            if(arr[j]!=0) j++;
            else{
                int k=arr.length-1;
                while(k>=j+2){
                    arr[k]=arr[k-1];
                    k--;
                }
                if(j+1<arr.length) arr[j+1]=0;
                j=j+2;


                }
            }

        }
        
    }
