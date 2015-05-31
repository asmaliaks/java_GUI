/**
 * Created by asmalouski on 31.5.15.
 */


public class Main {

    public static void main(String args[]){
        int sum;
        Reader r  = new Reader();
        r.scan();
        sum = count(r.i, r.k);
        System.out.println("The sum equals :"+sum);
    }

    public static int count(int x, int y){
        int res;
        res = x + y;
        return res;
    }
}
