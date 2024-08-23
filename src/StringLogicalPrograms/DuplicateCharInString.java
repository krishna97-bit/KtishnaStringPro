package StringLogicalPrograms;

public class DuplicateCharInString
{
    public static void main(String[] args)
    {

        String a = "Krishnaindrale";

        char b[] = a.toCharArray();

        for ( int i=0; i<b.length; i++)
        {
            for ( int j=i+1; j<b.length; j++)
            {
                if ( b[j] == b[i])
                {
                    System.out.println(b[j]);
                }
            }
        }

    }
}
