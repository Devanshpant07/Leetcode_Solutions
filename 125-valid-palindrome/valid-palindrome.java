class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(((int)s.charAt(i)>64 &&(int)s.charAt(i)<91) || ((int)s.charAt(i)>96 &&(int)s.charAt(i)<123)){
                char a=Character.toLowerCase(s.charAt(i));
                arr.add(a);
            }
            else if((int)s.charAt(i)>47 && (int)s.charAt(i)<58) arr.add(s.charAt(i));
        }
        ArrayList<Character> arr1=new ArrayList<>(arr);
        Collections.reverse(arr);
        System.out.println(arr);
         System.out.println(arr1);

        if(arr.equals(arr1)) return true;
        return false;
        
    }
}