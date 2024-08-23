package ArrayLogicalPrograms1;

public class MinimumNoFromArray
{
    public static void main(String[] args)
    {
        int a[] = { 10,14,47,78,89,96,63,32,25,85,45,10,63,1,5,7,9,3};
        int min = a[0];
        for ( int i=0; i<a.length; i++)
        {
            if ( min > a[i] )
            {
                min = a[i];
            }
        }

        System.out.println("Minimum no from array is "+min);

    }
}
