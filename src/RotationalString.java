import java.util.Scanner;

public class RotationalString {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the First String");
        String s1 = ob.nextLine();
        System.out.println("Enter the Second String");
        String s2 = ob.nextLine();

        boolean status = true;

        if((s1.length())!=(s2.length())){

            status = false;
        }
        for (int i=0 ; i<s1.length() ; i++)
        {
           String result = s1.substring(i+1)+s1.charAt(i);
        if(result.equalsIgnoreCase(s2))
        {
            status = true;
            break;
        }
        }
        if (status)
        {
            System.out.println("the String " +s2+ "  is rotation of the String " +s1);
        }
        else{
            System.out.println("the String " +s2+ "  is  not rotation of the String " +s1);
        }

    }

}
