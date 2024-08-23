package StringLogicalPrograms1;

public class ReverseEachWordInString
{
    public static void main(String[] args)
    {
        String a = "Krishna Indrale";

        String b[] = a.split(" ");
        String reverseString ="";
        for ( int i=0; i<b.length;i++)
        {
            String word=b[i];
            String reverseWord="";
            for ( int j = word.length()-1; j>=0; j--)
            {
                reverseWord = reverseWord+word.charAt(j);
            }

            reverseString = reverseString+reverseWord+" ";
        }
        System.out.println(reverseString);

        for ( int p=b.length-1; p>=0; p--)
        {
            System.out.print(b[p]+" ");
        }

    }
}
