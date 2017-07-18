package huawei历年编程题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by ASDF on 2017/7/18.
 */
class Score{
    String name;
    int score;
    int index;
    public Score(String name,int score,int index){
        this.score=score;
        this.index=index;
        this.name=name;
    }
}
public class 成绩排序 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextInt()){
            ArrayList<Score> list=new ArrayList<Score>();
            int index=0;
            int n=sc.nextInt();
            int flag=sc.nextInt();
            for(int i=1;i<=n;i++){
                list.add(new Score(sc.next(),sc.nextInt(),i));
            }
            Collections.sort(list, new Comparator<Score>() {
                @Override
                public int compare(Score o1, Score o2) {
                    return o1.score!=o2.score?o1.score-o2.score:o2.index-o1.index;
                }
            });
            if(flag==0){
                for(int i=list.size()-1;i>=0;i--){
                    System.out.println(list.get(i).name+" "+list.get(i).score);
                }
            }else{
                for(int i=0;i<list.size();i++){
                    System.out.println(list.get(i).name+" "+list.get(i).score);
                }
            }
        }
        sc.close();
    }
}
