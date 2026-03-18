import java.util.Scanner;

public class SortStrings 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextLine();
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j].compareTo(arr[j + 1]) > 0) 
                {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted strings:");
        for (String s : arr) 
        {
            System.out.println(s);
        }

        sc.close();
    }
}