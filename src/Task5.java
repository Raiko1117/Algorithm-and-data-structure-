import java.util.Scanner;
public class Task5
{
    private int fibb(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        return fibb(n-2) + fibb(n-1);
    }
    public void calculate(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fibb(n);
        System.out.println(res);
    }
}