package StringLogicalPrograms1;

public class PrintNoInString
{
    public static void main(String[] args)
    {
        String a = "Krishna465657^$#$%$$Indrale*&^%**^%#93754";

        StringBuilder OnlyNo = new StringBuilder();
        char b[] = a.toCharArray();
        for ( int i=0; i<b.length; i++)
        {
            if ( Character.isDigit(b[i]))
            {
                OnlyNo.append(b[i]);
            }
        }

        System.out.println(OnlyNo);

    }
}
