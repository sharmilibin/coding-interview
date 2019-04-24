import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n =ob.nextInt();
        System.out.println(series(n));


    }

    static int series(int n)
    {
        if (n < 0)
        {
            return 0;
        }
        if (n < 2)
        {
            return n;
        }

        return series(n-1)+series(n-2);


    }
}
