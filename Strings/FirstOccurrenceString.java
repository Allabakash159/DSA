// 28. Find the Index of the First Occurrence in a String


class Solution {
    public int strStr(String haystack, String needle) {
        String temp="";
        if(haystack.length()<needle.length()){
            return -1;
        }
        for(int i=0;i<needle.length();i++){
            temp=temp+haystack.charAt(i);
        }
        if(temp.equals(needle)){
            return 0;
        }

        for(int i=needle.length();i<haystack.length();i++){
            temp=temp.substring(1,temp.length())+haystack.charAt(i);
            if(temp.equals(needle)){
                return i-(needle.length()-1);
            }
        }

        return -1;
    }
}
