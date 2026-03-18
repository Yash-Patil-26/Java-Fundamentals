import java.util.Scanner;

public class RoundNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        System.out.print("Enter number of decimal places to round to: ");
        int n = sc.nextInt();

        double result = Math.round(num * Math.pow(10, n)) / Math.pow(10, n);

        System.out.println("Rounded result: " + result);
    }
}