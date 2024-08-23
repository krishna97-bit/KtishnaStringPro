package ArrayLogicalPrograms1;

import java.util.Arrays;

public class SecondMaximumNoFromArray
{
    public static void main(String[] args)
    {
        int a[] = { 10,14,47,78,89,96,63,32,25,85,45,10,63,1,5,7,9,3};

        Arrays.sort(a);

        System.out.println("Second maximum no from array is "+a[a.length-2]);

    }
}
