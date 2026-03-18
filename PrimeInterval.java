import java.util.Scanner;

public class PrimeInterval 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start and end:");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Prime numbers:");

        for (int i = start; i <= end; i++) 
            {

            if (i <= 1) 
            {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) 
            {
                if (i % j == 0) 
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) 
            {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}