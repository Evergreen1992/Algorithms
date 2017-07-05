package company.huawei;

import java.util.HashMap;

public class Main3 {
	public String[] chkBlood(String father, String mother) {
        HashMap<String, String> map = new HashMap<String,String>();
        map.put("OO", "O");
        map.put("AO", "A,O");
        map.put("AA", "A,O");
        map.put("AB", "A,AB,B,O");
        map.put("AAB", "A,AB,B");
        map.put("BO", "B,O");
        map.put("BB", "B,O");
        map.put("ABB", "A,AB,B");
        map.put("ABO", "A,B");
        map.put("ABAB", "A,AB,B");
        
        if( map.get(father+mother) != null){
        	return map.get(father+mother).split(",");
        }
        if( map.get(mother+father) != null){
        	return map.get(mother+father).split(",");
        }
        return null;
    }

	public static void main(String[] args){
	}
}