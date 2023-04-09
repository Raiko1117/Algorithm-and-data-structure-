import java.util.Scanner;

public class Task10{
    private int gcd(int a, int b){
        int q = a/b;
        int r = a - b*q;
        if(r == 0){
            return b;
        }
        return gcd(b,r);
    }
     /*a =  b * q + r
    48 = 32 * 1 + 16
    32 = 16 * 2 + 0*/
    public void calculate(){
        Scanner print = new Scanner(System.in);
        int a = print.nextInt();
        int b = print.nextInt();
        System.out.println(gcd(a,b));
    }


}
