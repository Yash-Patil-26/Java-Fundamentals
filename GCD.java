import java.util.Scanner;

public class GCD 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0 && b == 0) 
        {
            System.out.println("GCD not defined");
        } 
        else {
            while (b != 0) 
            {
                int temp = b;
                b = a % b;
                a = temp;
            }

            System.out.println("GCD = " + a);
        }

        sc.close();
    }
}
