class Solution {
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='O' ||ch=='I' || ch=='U') return true;
        return false;
    }
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int left=0,right=arr.length-1;
        while(left<right){
            while(left<right && !isVowel(arr[left])) left++;
            while(left<right && !isVowel(arr[right])) right--;
            if(left<right){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }

            
        }
        return new String(arr);
        
    }
}