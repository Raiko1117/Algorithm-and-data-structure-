import java.util.Scanner;
public class Task9 {
    private int bin(int n, int k){
        if(n <= k){
            return 1;
        }
        if(k <= 0){
            return 1;
        }
        return bin(n-1,k-1) + bin(n-1,k);
    }
    public void calculate(){
        Scanner print = new Scanner(System.in);
        int n = print.nextInt(), k = print.nextInt();
        System.out.println(bin(n,k));
    }
}
