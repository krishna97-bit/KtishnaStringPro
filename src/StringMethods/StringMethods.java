package StringMethods;

public class StringMethods
{
    public static void main(String[] args)
    {
        String a = "krishna";
        String b = "KRISHNA";

        // String methods
        // 1) equal case
        System.out.println(a.equals(b));

        // 2) equal ignore case
        System.out.println(a.equalsIgnoreCase(b));

        //3) upper case
        System.out.println(a.toUpperCase());

        // 4) lower case
        System.out.println(b.toLowerCase());

        // 5) length
        System.out.println(a.length());

        // 6) char at
        System.out.println(a.charAt(3));

        // 7) index of
        System.out.println(a.indexOf('s'));

        // 8) String start with
        System.out.println(a.startsWith("k"));

        // 9) end with
        System.out.println(a.endsWith("a"));

        // 10) substring start with
        System.out.println(a.substring(3));

        // 11) substring start and end with
        System.out.println(a.substring(3,5));

        // 12) Trim
        String c = " Krishna Indrale ";
        System.out.println(c.trim());

        // 13) concat
        System.out.println(c.concat(a));

        // 14) split
        String d = "Krishna Indrale";
        String e[] = d.split(" ");
        System.out.println(e[0]);
        System.out.println(e[1]);

        // 15) to char array
        char f[] = a.toCharArray();
        System.out.println(f[0]);
        System.out.println(f[2]);
        System.out.println(f[4]);
        System.out.println(f[6]);


    }
}
