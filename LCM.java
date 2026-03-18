import java.util.Scanner;

public class LCM 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0 || b == 0)
        {
            System.out.println("LCM not defined");
        } 
        else {
            int max = (a > b) ? a : b;

            while (true) 
                {
                if (max % a == 0 && max % b == 0) {
                    System.out.println("LCM = " + max);
                    break;
                }
                max++;
            }
        }

        sc.close();
    }
}