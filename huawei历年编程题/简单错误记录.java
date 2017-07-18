package huawei历年编程题;

import java.util.Scanner;
import java.util.LinkedHashMap;

public class 简单错误记录 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            String name=str.split(" ")[0];
            String line=str.split(" ")[1];

            if(name.contains("\\"))
                name=name.split("\\\\")[name.split("\\\\").length-1];
            if(name.length()>16)
                name=name.substring(name.length()-16);

            if(map.get(name+" "+line)==null){
                map.put(name+" "+line,1);
            }else
                map.put(name+" "+line,map.get(name+" "+line)+1);
        }

        int index=0;
        for(String key:map.keySet()){
            index++;
            String name=key.split(" ")[0];
            String line=key.split(" ")[1];
            Integer count=map.get(key);

            if(index>map.keySet().size()-8){
                System.out.println(name+" "+line+" "+count);
            }
        }

        sc.close();
    }
}