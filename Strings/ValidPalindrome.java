// 125. Valid Palindrome

// Two pointers can also be used

class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toLowerCase();
        
        StringBuffer sb=new StringBuffer();
        
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=97&&(int)s.charAt(i)<=122||(int)s.charAt(i)>=48&&(int)s.charAt(i)<=57){
                sb.append(s.charAt(i));
            }
        }
        
        for(int i=0;i<sb.length()/2;i++){
            if((int)sb.charAt(i)!=(int)sb.charAt(sb.length()-1-i)){
                return false;
            }
        }

        return true;
        
    }
}
