import java.util.Scanner;

public class Task3
{
    private boolean isPrime(int n, int i)
    {
        if (i * i > n)
        {
            return true;
        }
        if (n % i == 0)
        {
            return false;
        }

        return isPrime(n, i + 1);

    }

    public void calculate()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean prime = isPrime(n, 2);

        System.out.println(prime);
    }

}
