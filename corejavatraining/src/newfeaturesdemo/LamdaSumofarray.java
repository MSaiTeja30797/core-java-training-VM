package newfeaturesdemo;

import java.util.Arrays;
 class LamdaSumofarray
{
    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3, 4, 5 ,6,7,8,9,10};
        int sum = Arrays.stream(A).sum();
 
        System.out.println("The sum of all the array elements is " + sum);
    }
}