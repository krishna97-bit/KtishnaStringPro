package StringLogicalPrograms;

public class PrintOnlyCharByReplaceAll
{
    public static void main(String[] args)
    {
        String a = "Krishna846557Indrale84657";

        String OnlyChar = a.replaceAll("[0-9]","");
        System.out.println(OnlyChar);

    }
}
