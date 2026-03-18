import java.util.Scanner;

public class VowelConsonantCheck 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
        {
            System.out.println("The character is a Vowel");
        } 
        else 
        {
            System.out.println("The character is a Consonant");
        }
    }
}