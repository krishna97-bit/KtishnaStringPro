package StringLogicalPrograms;

public class ReverseEachWordInString
{
    public static void main(String[] args)
    {
        String a = "Krishna Indrale";
        String b[] = a.split(" ");
        String reverseString = "";

        for ( int i=0; i<b.length; i++)
        {
            String reverseWord="";
            String word = b[i];

            for ( int j=word.length()-1; j>=0; j--)
            {
                reverseWord = reverseWord+word.charAt(j);
            }

            reverseString = reverseString+reverseWord+" ";
        }

        System.out.print(reverseString);

    }
}
