package StringLogicalPrograms;

public class PrintOnlyNoInString
{
    public static void main(String[] args)
    {
        String a = "Krishna85656@#$%)(&5856Indrale6454";
        StringBuilder OnlyNo = new StringBuilder();
        char b[] = a.toCharArray();

        for ( int i=0; i<b.length; i++)
        {
            if (Character.isDigit(b[i]))
            {
                OnlyNo.append(b[i]);
            }
        }

        System.out.println(OnlyNo);

    }
}
