import java.util.Scanner;

public class CheckString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str == null || str.isEmpty()) 
        {
            System.out.println("The string is Empty or Null");
        } 
        else 
        {
            System.out.println("The string is Not Empty");
        }
    }
}