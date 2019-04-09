import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Stringreversal {
    public static void main(String[] args) {
        System.out.println("Enter the String to reverse");
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();
        String str2 = "";
        for(int i = str1.length()-1; i >= 0 ; i--)
        {
            str2=str2 + str1.charAt(i);
        }
        System.out.println("The reversed String is " );
        System.out.println(str2);
        betterSolution(str1);
    }

    private static void betterSolution(String str1)
    {
        int n = str1.length();
      
        char strArr [] = str1.toCharArray();
        char temp ;
        for (int i=0;i<n/2;i++)
        {
            temp = strArr[i];
            strArr[i] = strArr[n-1-i];
            strArr[n-1-i] = temp;
        }
        System.out.println("the reversal for better");
        System.out.println(String.valueOf(strArr));

    }
}
