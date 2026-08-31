class Solution {
    public void setZeroes(int[][] matrix) {
        int[] arr1=new int[matrix.length];
        int[] arr2=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    arr1[i]=1;
                    arr2[j]=1;
                }

            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==1){
                for(int j=0;j<matrix[0].length;j++) matrix[i][j]=0;
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]==1){
                for(int j=0;j<matrix.length;j++) matrix[j][i]=0;
            }
        }
        
    }
}