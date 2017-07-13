package 面试宝典;

/**
 * Created by ASDF on 2017/7/13.
 */
public class 珠玑妙算 {
    public int[] calcResult(String A, String guess) {
        int correct=0, fakeCorrect=0;
        int[] a=new int[256], b= new int[256];
        for(int i=0;i<4;i++){
            if(A.charAt(i)==guess.charAt(i))
                correct++;
            a[A.charAt(i)]++;
            b[guess.charAt(i)]++;
        }
        for(int i=0;i<a.length;i++){
            fakeCorrect+=a[i]<=b[i]?a[i]:b[i];
        }
        return new int[]{correct,fakeCorrect-correct};
    }
}
