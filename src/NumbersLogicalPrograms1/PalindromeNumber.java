package NumbersLogicalPrograms1;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        int a = 121;
        int b=a;
        int rem=0;
        int rev=0;

        while(b>0)
        {
            rem = b%10;
            rev = rev*10+rem;
            b=b/10;
        }

        if ( a== rev)
        {
            System.out.println("Given no is palindrome no");
        }

        else
        {
            System.out.println("Given no is not a palindrome no");
        }

    }
}
