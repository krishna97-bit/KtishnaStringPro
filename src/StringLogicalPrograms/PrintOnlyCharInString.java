package StringLogicalPrograms;

public class PrintOnlyCharInString
{
    public static void main(String[] args)
    {
        String a = "Krishna85656@#$%)(&5856Indrale6454";
        // print only char in string

        StringBuilder OnlyChar = new StringBuilder();
        char b[] = a.toCharArray();

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
