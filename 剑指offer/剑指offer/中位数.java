package 剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 中位数 {
	List<Integer> list = new ArrayList<Integer>();
	public void Insert(Integer num) {
	    list.add(num);
    }

    public Double GetMedian() {
        Collections.sort(list);
        if( list.size() % 2 == 1)
        	return (double)list.get(list.size() / 2);// 0 1 2 3
        else
        	return (double)(list.get(list.size() / 2) + list.get(list.size() / 2 - 1))/2;
    }
	public static void main(String[] args) {

	}
}