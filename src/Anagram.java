import jdk.net.SocketFlow;

import java.util.Scanner;
import java.util.Arrays;


public class Anagram {
    public static void main(String[] args) {
        System.out.println("Enter the first String");
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();
        String s1 = str1.replaceAll("\\s", "");

        System.out.println("Enter the second String");
        Scanner str3 = new Scanner(System.in);
        String str2 = str3.nextLine();
        String s2 = str2.replaceAll("\\s", "");

        boolean status = false;

        if (s1.length() != s2.length()) {
            status = true;

        } else {
            char[] S1arr = s1.toLowerCase().toCharArray();
            char[] S2arr = s2.toLowerCase().toCharArray();
            Arrays.sort(S1arr);
            Arrays.sort(S2arr);
            status = Arrays.equals(S1arr, S2arr);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
        betterSolution(str1,str2);
    }


    private static void betterSolution(String str1, String str2) {


    }
}

