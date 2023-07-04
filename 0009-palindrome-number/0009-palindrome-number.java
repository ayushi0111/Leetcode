class Solution {
    public boolean isPalindrome(int x) {
        int temp;
        temp=x;
        int sum= 0;
        while(x>0){
        int r= x%10; //for getting the remainder
        sum = (sum*10) + r;
        x = x/10;
        }

        if(temp==sum){
            return true;
        }
        if(temp==0){
            return true;
        }
        else{return false;}
    }
}