public class Solution {
    public int romanToInt(String s) {
        if(s==null||s.length()==0) return 0;
        int rst=0;
        HashMap<Character, Integer>m=new HashMap<Character,Integer>();
        m.put('M',1000);m.put('D',500);m.put('C',100);
        m.put('L',50);m.put('X',10);m.put('V',5);m.put('I',1);
        rst=rst+m.get(s.charAt(0));
        int pre=m.get(s.charAt(0)),cur=0;
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            cur=m.get(c);
            if(cur>pre){
                rst=rst-pre+(cur-pre);
            }else{
                rst=rst+cur;
            }
            pre=cur;
        }
        return rst;
    }
}