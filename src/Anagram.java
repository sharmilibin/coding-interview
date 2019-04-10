import jdk.net.SocketFlow;

import java.util.Scanner;
import java.util.Arrays;


public class Anagram {
    public static void main(String[] args) {
        System.out.println("Enter the first String");
        Scanner ob = new Scanner(System.in);
        String str1 = ob.nextLine();
        String s1 = str1.replaceAll("\\s", "");

        System.out.println("Enter the second String");
        Scanner ob1 = new Scanner(System.in);
        String str2 = ob1.nextLine();
        String s2 = str2.replaceAll("\\s", "");

        boolean status = false ;

        if (s1.length() != s2.length()) {
            status = false;

        } else {
            char[] S1arr = s1.toLowerCase().toCharArray();
            char[] S2arr = s2.toLowerCase().toCharArray();
            Arrays.sort(S1arr);
            Arrays.sort(S2arr);
            status = Arrays.equals(S1arr, S2arr);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are Anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not Anagrams");
        }
        betterSolution(str1,str2);
    }


    private static void betterSolution(String str1, String str2) {

        boolean status = true;

        if (str1.length() != str2.length())
        {
            status = false;

        }
        int[] a = new int[128];
        for (int i = 0; i < str1.length(); i++) {
            a[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {

            a[str2.charAt(i)]--;

        if (a[str2.charAt(i)]<0)
        {
           status = false;
        }
        else{
            status = true;
        }

        }
        if(status)
        {
            System.out.println("for better "+str1+ " and" +str2+ " are Anagrams" );
        }
        else{
            System.out.println("for better " +str1+ " and " +str2+ " are not Anagrams" );
        }

    }
}

