package ArrayLogicalPrograms;

import java.util.Arrays;

public class SortArrayInAscendingOrder
{
    public static void main(String[] args)
    {
        int a[] = { 10,14,47,78,89,96,63,32,25,85,45,10,63,1,5,7,9,3};

        Arrays.sort(a);
        for ( int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + ",");
        }
    }
}
