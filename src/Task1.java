import java.util.Scanner;
public class Task1 {
    private int findMin(int[] arr, int n, int i, int j)
    {
        if (j >= n)
        {
            return arr[i];
        }

        if (arr[i] > arr[j])
        {
            i = j;
        }
        return findMin(arr, n, i, j + 1);
    }
    public  void calculate()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int min = findMin(arr, n, 0, 1);
        System.out.println(min);

    }
}
