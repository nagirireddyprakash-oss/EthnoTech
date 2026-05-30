/*import java.util.Arrays;
public class RotatedRightArray
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int n = arr.length;
        int[] rotated = new int[n];

        for(int i = 0; i < n; i++)
        {
            int newPosition = (i + k) % n;
            rotated[newPosition] = arr[i];
        }

        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Rotated Array  : " + Arrays.toString(rotated));
    }
}*/

import java.util.Scanner;

public class TemperatureAnalysis
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double[] temp = new double[30];

        double highest;
        double lowest;
        double sum = 0;

        System.out.println("Enter temperatures for 30 days:");

        for(int i = 0; i < 30; i++)
        {
            System.out.print("Day " + (i + 1) + ": ");
            temp[i] = sc.nextDouble();
        }

        highest = temp[0];
        lowest = temp[0];

        for(int i = 0; i < 30; i++)
        {
            if(temp[i] > highest)
            {
                highest = temp[i];
            }

            if(temp[i] < lowest)
            {
                lowest = temp[i];
            }

            sum += temp[i];
        }

        double average = sum / 30;

        System.out.println("\nHighest Temperature : " + highest + "°C");
        System.out.println("Lowest Temperature  : " + lowest + "°C");
        System.out.println("Average Temperature : " + average + "°C");

        System.out.println("\nTemperatures Greater Than 35°C:");

        for(int i = 0; i < 30; i++)
        {
            if(temp[i] > 35)
            {
                System.out.println("Day " + (i + 1) + " : " + temp[i] + "°C");
            }
        }

        sc.close();
    }
}