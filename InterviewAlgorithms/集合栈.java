package InterviewAlgorithms;

import java.util.ArrayList;

/**
 * Created by ASDF on 2017/7/10.
 */
public class 集合栈 {
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        ArrayList<ArrayList<Integer>> stack=new ArrayList<ArrayList<Integer>>();
        stack.add(new ArrayList<Integer>());
        for(int[] arr:ope){
            int type=arr[0];
            int num=arr[1];
            if(type==1){//push
                if(stack.get(stack.size()-1).size()<size){
                    stack.get(stack.size()-1).add(num);
                }else{
                    ArrayList<Integer> list=new ArrayList<Integer>();
                    list.add(num);
                    stack.add(list);
                }
            }
            if(type==2){//pop
                if(stack.get(stack.size()-1).size()<=0){
                    stack.remove(stack.size()-1);
                    if(stack.size()!=0){
                        stack.get(stack.size()-1).remove(stack.get(stack.size()-1).size()-1);
                    }
                }else{
                    stack.get(stack.size()-1).remove(stack.get(stack.size()-1).size()-1);
                }
            }
        }
        return stack;
    }
    public static void main(String[] args) {

    }
}