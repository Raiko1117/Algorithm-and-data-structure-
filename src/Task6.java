import java.util.Scanner;
public class Task6 {
    private int power(int a, int n){
        if(n <= 1)
        {
            return a;
        }
        return a * power(a,n-1);
    }
    public void calculate(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int result = power(a,n);
        System.out.println(result);
    }
}