import java.util.Scanner;

public class ArmstrongInterval 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start and end:");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Armstrong numbers:");

        for (int i = start; i <= end; i++) 
            {
            int num = Math.abs(i);
            int sum = 0;

            while (num != 0) 
            {
                int rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;
            }

            if (sum == i) 
            {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
