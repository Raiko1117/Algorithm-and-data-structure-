import java.util.Scanner;

public class Task2 {

    private int sum(int[] arr,  int i){
        if(i >= arr.length){
            return 0;
        }
        return arr[i] + sum(arr,i+1);
    }

    private double findAverage(int[] arr){
        return (double) sum(arr, 0) / arr.length;

    }

    public void calculate(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        double res = findAverage(arr);
        System.out.println(res);

    }
}
