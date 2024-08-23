package StringLogicalPrograms;

public class PrintOnlyNoByReplaceAll
{
    public static void main(String[] args)
    {
        String a = "Krishna846557Indrale84657";

        String onlyNo = a.replaceAll("[^0-9]","");
        System.out.println(onlyNo);

    }
}
