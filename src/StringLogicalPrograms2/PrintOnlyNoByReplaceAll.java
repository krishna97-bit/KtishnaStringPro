package StringLogicalPrograms2;

public class PrintOnlyNoByReplaceAll
{
    public static void main(String[] args)
    {
        String a = "94748Krishna89476454Indrale83464";

        String b = a.replaceAll("[^0-9]","");
        System.out.println(b);

    }
}
