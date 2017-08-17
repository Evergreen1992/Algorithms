package InterviewAlgorithms;
/**
 * Created by ASDF on 2017/7/13.
 */
public class 二进制小数 {
    public String printBin(double num) {
        if(num<0||num>1)
            return "Error";
        String str="0.";
        int count=0;
        double flag=0.5;
        while(num>0){
            if(num>=flag){
                str+="1";
                num-=flag;
            }else
                str+="0";

            count++;
            flag*=0.5;
            if(count>32)
                return "Error";
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(new 二进制小数().printBin(0.625));
    }
}