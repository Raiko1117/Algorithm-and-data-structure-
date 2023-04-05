import java.util.Scanner;

public class Task4 {
    private int fib(int n){
        if(n == 1){
            return 1;
        }
        return n * fib(n-1);

    }
    public void calculate(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fib(n);
        System.out.println(res);
    }
}
