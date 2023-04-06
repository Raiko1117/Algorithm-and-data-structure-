import java.util.Scanner;

public class Task5 {
    private int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n-2) + fib(n-1);

    }
    public void calculate(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fib(n);
        System.out.println(res);
    }
}
