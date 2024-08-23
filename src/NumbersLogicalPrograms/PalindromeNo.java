package NumbersLogicalPrograms;

public class PalindromeNo
{
    public static void main(String[] args)
    {
        int a= 121;
        int b=a;
        int rev =0;
        int rem=0;

        while(b>0)
        {
            rem = b%10;  // 121%10 = 1 // 12%10 = 2 // 1%10 = 1
            rev =rev*10+rem; // 1*10+1 = 1 // 1*10+2 = 12 // 12*10+1 = 121
            b=b/10; // 121/10 =12 // 12/10 = 1 // 1/10 = 0
        }

        if(a== rev)
        {
            System.out.println("Given no is palindrome no");
        }

        else
        {
            System.out.println("Given no is not a palindrome no");

        }



    }
}
