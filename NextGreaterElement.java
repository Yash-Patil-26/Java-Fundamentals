public class NextGreaterElement 
{

    public static void main(String[] args) 
    {

        int arr[] = {4,5,2,10,8};
        int n = arr.length;

        int result[] = new int[n];
        int stack[] = new int[n];
        int top = -1;

        for(int i = n-1; i >= 0; i--) 
        {

            while(top >= 0 && stack[top] <= arr[i]) 
            {
                top--;
            }

            if(top == -1)
                result[i] = -1;
            else
                result[i] = stack[top];

            stack[++top] = arr[i];
        }

        for(int i=0;i<n;i++)
            System.out.print(result[i] + " ");
    }
}