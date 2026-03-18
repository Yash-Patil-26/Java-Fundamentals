import java.util.Scanner;

public class Power
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base and exponent:");
        int base = sc.nextInt();
        int exp = sc.nextInt();

        int result = 1;

        if (exp < 0) 
        {
            System.out.println("Negative exponent not supported");
        } 
        else {
            for (int i = 1; i <= exp; i++) 
            {
                result = result * base;
            }

            System.out.println("Result = " + result);
        }

        sc.close();
    }
}