class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(j<s.length() && s.charAt(j)==' ') j++;
        while(j<s.length()){
            i=j;
            while(j<s.length() && s.charAt(j)!=' ') j++;
            int k=j-1;
            while(k>=i){
                sb.append(s.charAt(k));
                k--;
            }
            while(j<s.length() && s.charAt(j)==' ') j++;
            if(j<s.length()) sb.append(' ');
            
        }
        sb.reverse();
        String str=sb.toString();
        return str;
        
    }
}