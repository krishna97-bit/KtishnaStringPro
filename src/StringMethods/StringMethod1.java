package StringMethods;

public class StringMethod1
{
    public static void main(String[] args)
    {
        String a = "Krishna";
        String b = "KRISHNA";

        // String methods
        // 1) equal case
        System.out.println(a.equals(b));

        //2) equal ignore case
        System.out.println(a.equalsIgnoreCase(b));

        // 3) upper case
        System.out.println(a.toUpperCase());

        // 4) lower case
        System.out.println(b.toLowerCase());

        // 5) char at
        System.out.println(a.charAt(3));

        // 6) index of
        System.out.println(a.indexOf("s"));

        // 7) string start with
        System.out.println(a.startsWith("k"));

        // 8) string end with
        System.out.println(a.endsWith("a"));

        // 9) Substring start from
        System.out.println(a.substring(3));

        // 10) substring start and end with
        System.out.println(a.substring(2,5));

        // 11) trim
        String c = " Krishna Indrale ";
        System.out.println(c.trim());

        // 12) concat
        System.out.println(c.concat(a));

        // 13) split
        String d = "java is best";
        String e[] = d.split(" ");
        System.out.println(e[0]);
        System.out.println(e[1]);
        System.out.println(e[2]);

        // 14) to char array
        char f[] = a.toCharArray();
        System.out.println(f[0]);
        System.out.println(f[2]);
        System.out.println(f[4]);
        System.out.println(f[6]);

        // 15) length
        System.out.println(a.length());

    }
}
