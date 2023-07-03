class Solution {
   
    public int lengthOfLongestSubstring(String s) {
        int max=0;
      //Declaring StringBuilder
        StringBuilder ans = new StringBuilder();
      //Declaring HashSet
        HashSet<Character> r = new HashSet<>();
      

        for(int i=0;i<s.length();i++){
            if(r.contains(s.charAt(i))){
              max =Math.max(max,ans.length());
              int k = ans.indexOf(Character.toString(s.charAt(i)));
              if(ans.length()!=0 && k!=-1){
                   while(k>=0) {
                       r.remove(ans.charAt(k));
                       ans.deleteCharAt(k);
                       k--;
                    }
              }
                else{
                    ans.deleteCharAt(0);
                }

            r.add(s.charAt(i));
            ans.append(s.charAt(i));
            }
            else{
                ans.append(s.charAt(i));
                r.add(s.charAt(i));
           
            }            
         }
       
        max = Math.max(max,ans.length());
        return max;
    }
}