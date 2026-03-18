import java.util.Scanner;

public class CheckAlphabet
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character:");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
        {
            System.out.println("Alphabet");
        } 
        else {
            System.out.println("Not Alphabet");
        }

        sc.close();
    }
}