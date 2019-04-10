
import java.util.Scanner;
import java.util.Arrays;


public class Anagram {
    public static void main(String[] args) {
        System.out.println("Enter the first String");
        Scanner ob = new Scanner(System.in);
        String str1 = ob.nextLine();
        String s1 = str1.replaceAll("\\s", "");

        System.out.println("Enter the second String");
        String str2 = ob.nextLine();
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
        if(betterSolution(str1,str2)) {
            System.out.println(s1 + " and " + s2 + " are Anagrams");
        } else{
            System.out.println(s1 + " and " + s2 + " are not Anagrams");
        }
    }


    private static boolean betterSolution(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] a = new int[128];
        for (int i = 0; i < str1.length(); i++) {
            a[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            a[str2.charAt(i)]--;
            if (a[str2.charAt(i)]<0) {
                return false;
            }
        }
        return true;
    }
}

