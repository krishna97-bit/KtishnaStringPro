package ArrayLogicalPrograms;

public class MaximumNoFromArray
{
    public static void main(String[] args)
    {
        int a[] = { 10,14,47,78,89,96,63,32,25,85,45,10,63,1,5,7,9,3};
        int max = a[0];

        for ( int i=0; i<a.length; i++)
        {
            if ( max <a[i])
            {
                max = a[i];
            }
        }

        System.out.println(max);

    }
}
