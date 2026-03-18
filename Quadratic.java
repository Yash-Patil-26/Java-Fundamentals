import java.util.Scanner;

public class Quadratic 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c; // Discriminant

        if (d > 0) 
        {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct: " + r1 + " , " + r2);
        }
         else if (d == 0) 
        {
            double r = -b / (2 * a);
            System.out.println("Roots are real and equal: " + r);
        } 
        else 
        {
            System.out.println("Roots are imaginary");
        }
    }
}