package InterviewAlgorithms;

/**
 * Created by ASDF on 2017/7/14.
 */
public class 合法括号序列判断 {
    public boolean chkParenthesis(String A, int n) {
        boolean flag=true;
        int l=0, r=0;
        for(char c:A.toCharArray()){
            if(c!='('&&c!=')'){
                flag=false;
                break;
            }
            if(c=='(')
                l++;
            if(c==')')
                r++;
            if(r>l){
                flag=false;
                break;
            }
        }
        if(l!=r)
            flag=false;
        return flag;
    }
}
