public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String rst=new String();
        if(strs==null||strs.length==0) return rst;
        String m=new String();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
                m=strs[i];
            }
        }
        for(int i=0;i<m.length();i++){
            char c=m.charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=c)
                    return rst;
            }
            rst=rst+String.valueOf(c);
        }
        return rst;
    }
}