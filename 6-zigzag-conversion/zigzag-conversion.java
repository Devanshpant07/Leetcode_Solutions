class Solution {
    public String convert(String s, int numRows) {
        ArrayList<ArrayList<Character>> arr=new ArrayList<>();
        int n=s.length();
        int i=0,j=0;
        if(n<=numRows) return s;
        while(j<numRows){
            arr.add(new ArrayList<>());
            j++;
        }
        while(i<n){
            for(int up=0;up<numRows && i<n;up++) arr.get(up).add(s.charAt(i++));
            for(int down=numRows-2;down>0 && i<n;down--) arr.get(down).add(s.charAt(i++));
            
        }
        String str="";
        for(ArrayList<Character> ar:arr){
            for(char ele : ar) str+=ele;
        }
        return str;

      
        
        

        
    }
}