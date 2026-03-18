import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;

        num = Math.abs(num); // handle negative numbers

        while (num != 0) 
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (original < 0) 
        {
            rev = -rev;
        }

        if (original == rev) 
        {
            System.out.println("Palindrome");
        } 
        else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}