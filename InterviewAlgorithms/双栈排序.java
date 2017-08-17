package InterviewAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Created by ASDF on 2017/7/10.
 */
public class 双栈排序 {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(numbers==null||numbers.length==0)
            return list;
        Stack<Integer> stk=new Stack<Integer>();
        Stack<Integer> stkTmp=new Stack<Integer>();
        for(int i=numbers.length-1;i>=0;i--)
            stk.push(numbers[i]);
        stkTmp.push(stk.pop());
        while(!stk.isEmpty()){
            int top=stk.pop();
            while(!stkTmp.isEmpty()&&stkTmp.peek()<top){
                stk.push(stkTmp.pop());
            }
            stkTmp.push(top);
            while(!stk.isEmpty()&&stkTmp.peek()>stk.peek()){
                stkTmp.push(stk.pop());
            }
        }
        while(!stkTmp.isEmpty())
            list.add(stkTmp.pop());
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        for(int it:new 双栈排序().twoStacksSort(new int[]{1,3,5,2,4})){
            System.out.println(it+" ");
        }
    }
}