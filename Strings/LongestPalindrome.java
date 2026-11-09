// 409. Longest Palindrome

class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        boolean once=true;
        int cnt=0;
        for(Integer value : map.values()){
            if(value%2!=0 && once==true){
                cnt++;
                once = false;
            }
            if(value>=2){
                if(value%2==0){
                    cnt+=value;
                }else{
                    cnt+=value-1;
                }
            }
        };

        return cnt;

    }
}
