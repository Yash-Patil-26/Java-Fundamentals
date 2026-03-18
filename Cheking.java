import java.util.*;

public class Cheking
 {
    public static boolean isPalindrome(int n) 
    {
        String s = Integer.toString(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static int reverse(int n) 
    {
        int rev = 0;
        while (n != 0) 
        {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (!isPalindrome(n)) 
        {
            n = n + reverse(n);
        }

        System.out.println(n);
    }
}