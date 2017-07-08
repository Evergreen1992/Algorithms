package 算法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by ASDF on 2017/6/29.
 */
public class 把数组排成最小的数 {
    public static String PrintMinNumber(int [] numbers) {
        String result="";
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int it : numbers)
            list.add(it);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer s1, Integer s2) {
                String t1=s1+""+s2;
                String t2=s2+""+s1;
                return t1.compareTo(t2);
            }
        });
        for(int it : list)
            result+=it;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(PrintMinNumber(new int[]{3,32,321}));
    }
}