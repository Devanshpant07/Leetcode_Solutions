class Solution {
    public boolean detectCapitalUse(String s) {
        String a=s.substring(0,1);
        String b=s.substring(1);
        String c=a.toUpperCase()+b.toLowerCase();
        if(s.equals(s.toLowerCase())) return true;
        else if(s.equals(s.toUpperCase())) return true;
        else if(s.equals(c)) return true;
        return false;
        
    }
}