package ArrayLogicalPrograms1;

import java.util.Arrays;

public class SortArrayInDescendingOrder
{
    public static void main(String[] args)
    {
        int a[] = { 10,14,47,78,89,96,63,32,25,85,45,10,63,1,5,7,9,3};

        Arrays.sort(a);
        for ( int i=a.length-1; i>=0; i--)
        {
            System.out.print(a[i]+",");
        }

    }
}
