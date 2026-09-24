class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        int max=arr[0];
        for(int i=1;i<n;i++){
            max=Math.max(max,arr[i]);
            
        }
        int[] count=new int[max+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int min=Integer.MIN_VALUE;
        for(int i=0;i<count.length;i++){
            if(count[i]==i){
                if(count[i]>min) min=count[i];
            }
        }
        if(min==0) return -1;
        return min;
        
    }
}