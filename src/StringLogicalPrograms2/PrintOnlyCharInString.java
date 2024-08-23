package StringLogicalPrograms2;

public class PrintOnlyCharInString
{
    public static void main(String[] args)
    {
        String a = "57597Krisna*^%^^Indrale49587*&^";
        StringBuilder onlyChar = new StringBuilder();
        char b[] = a.toCharArray();
        for ( int i=0; i<b.length; i++)
        {
           if ( Character.isLetter(b[i]))
           {
               onlyChar.append(b[i]);
           }
        }

        System.out.println(onlyChar);

    }
}
