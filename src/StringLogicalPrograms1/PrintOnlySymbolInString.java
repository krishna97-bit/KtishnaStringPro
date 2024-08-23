package StringLogicalPrograms1;

public class PrintOnlySymbolInString
{
    public static void main(String[] args) {


        String a = "Krishna*&^%^45676*&^^6Indrale&^^^8866^%^";

        StringBuilder OnlySymbol = new StringBuilder();
        char b[] = a.toCharArray();
        for ( int i=0; i<b.length; i++)
        {
            if (!Character.isLetterOrDigit(b[i]))
            {
                OnlySymbol.append(b[i]);
            }
        }

        System.out.println(OnlySymbol);
    }
}
