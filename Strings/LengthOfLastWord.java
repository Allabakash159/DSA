// 58. Length of Last Word

class Solution {
    public int lengthOfLastWord(String s) {
        // String temp="";
        // ArrayList<String> lst=new ArrayList<>();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==' '&&temp!=""){
        //         lst.add(temp);
        //         temp="";
        //         continue;
        //     }
        //     if(s.charAt(i)==' '){
        //         continue;
        //     }
        //     temp+=s.charAt(i);
        // }
        // if(temp!=""){
        //     lst.add(temp);
        // }
        // temp=lst.get(lst.size()-1);
        // return temp.length();


        int i=s.length()-1;

        while(i>=0 && s.charAt(i)==' '){
            i--;
        }


        int cnt =0;

        while(i>=0 && s.charAt(i)!=' '){
            cnt++;
            i--;
        }

        return cnt;
    }
}
