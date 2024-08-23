package StringLogicalPrograms1;

public class PrintOnlyNoByReplaceAll
{
    public static void main(String[] args)
    {
        String a = "957578krih74647na5655Indrale846";
        String b = a.replaceAll("[^0-9]","");
        System.out.println(b);

    }
}
