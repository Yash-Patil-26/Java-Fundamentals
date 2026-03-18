import java.util.Scanner;

public class LargestNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();

        int largest;

        if (a >= b && a >= c) 
        {
            largest = a;
        } 
        else if (b >= a && b >= c)
        {
            largest = b;
        } 
        else 
        {
            largest = c;
        }

        System.out.println("Largest = " + largest);
    }
}