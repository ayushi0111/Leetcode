class Solution {
    
    public void helper(StringBuilder s , int n , List<String> list, int L , int R){
        if(s.length()==2*n ){
            list.add(s.toString());
            return;
        }
        if(L<n){
            s.append('(');
            helper( s, n , list, L+1, R );
            s.deleteCharAt(s.length()-1);
        } 
        if(R<L){
            s.append(')');
            helper( s, n , list , L , R+1); 
            s.deleteCharAt(s.length()-1);
        } 
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        helper(s , n , list , 0 , 0);
        return list;
    }
}