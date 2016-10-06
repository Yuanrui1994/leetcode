public class Solution {
    public String countAndSay(int n) {
        if(n<=0) return "";
        if(n==1) return "1";
        String tmp=countAndSay(n-1);
        return helper(tmp);
    }
    public String helper(String s){
        if(s==null||s.length()==0) return "";
        String rst=new String();
        int count=0;
        char c=s.charAt(0);
        int i=0;
        while(i<s.length()){
           if(s.charAt(i)==c){
                count++;
                i++;
            }else{
            	rst=rst+count+String.valueOf(c);
            	c=s.charAt(i);
            	count=1;
            	i++;
            }
        }
        return rst+count+String.valueOf(c);
    }
}