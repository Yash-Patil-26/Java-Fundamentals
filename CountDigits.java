import java.util.Scanner;

public class CountDigits
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int count = 0;

        if (num == 0) 
        {
            count = 1;
        } 
        else {
            num = Math.abs(num); // handles negative numbers

            while (num != 0) 
            {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);

        sc.close();
    }
}