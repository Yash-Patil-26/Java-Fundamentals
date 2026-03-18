import java.util.Scanner;

public class Armstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        num = Math.abs(num); // for negative numbers

        while (num != 0) 
        {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }

        if (original == sum) 
        {
            System.out.println("Armstrong");
        } 
        else 
        {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}