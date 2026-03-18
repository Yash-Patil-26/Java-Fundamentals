public class RemoveDuplicate 
{

    public static void main(String[] args) 
    {

        String s = "abbaca";
        char stack[] = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);

            if (top >= 0 && stack[top] == ch) 
            {
                top--; // pop
            } 
            else 
            {
                stack[++top] = ch; // push
            }
        }

        System.out.print("Output: ");
        for (int i = 0; i <= top; i++) 
        {
            System.out.print(stack[i]);
        }
    }
}