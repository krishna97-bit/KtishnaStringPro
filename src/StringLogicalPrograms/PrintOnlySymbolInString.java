package StringLogicalPrograms;

public class PrintOnlySymbolInString
{
    public static void main(String[] args)
    {
        String a = "Krishna85656@#$%)(&5856Indrale6454";
        StringBuilder OnlySym = new StringBuilder();
        char b[] = a.toCharArray();

        for ( int i=0; i<b.length; i++)
        {
            if (!Character.isLetterOrDigit(b[i]))
            {
                OnlySym.append(b[i]);
            }
        }

        System.out.println(OnlySym);

    }
}
