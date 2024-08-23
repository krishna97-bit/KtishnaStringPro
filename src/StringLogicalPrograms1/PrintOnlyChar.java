package StringLogicalPrograms1;

public class PrintOnlyChar
{
    public static void main(String[] args)
    {
        String a = "Krishna*&%$$89875645Indrale*^%^&4875";

        StringBuilder OnlyChar = new StringBuilder();
        char [] b= a.toCharArray();

        for ( int i=0; i<b.length; i++)
        {
            if (Character.isLetter(b[i]))
            {
                OnlyChar.append(b[i]);
            }
        }

        System.out.println(OnlyChar);


    }
}
