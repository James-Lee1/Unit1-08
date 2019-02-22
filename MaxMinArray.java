/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Feb 2019
 * Created for: ICS4U
 * This program generates 10 numbers from 1-99 and shows the user the lowest
 * value in the list
 *
 ****************************************************************************/

import java.util.Arrays;
import java.util.Random;

public class MaxMinArray
{
    public static void main(String[] arg)
    {
        Random rand = new Random();

        int[] intArray;
        int maxValue;
        int minValue;
        intArray = new int[10];

        //System.out.print(intArray.length);
        for (int index = 0; index < intArray.length; index++)
        {
            intArray[index] = rand.nextInt(99) + 1;
        }
        System.out.println(Arrays.toString(intArray));
        maxValue = maxValue(intArray);
        minValue = minValue(intArray);
        System.out.printf(maxValue + "%n");
        System.out.print(minValue);
    }

    public static int maxValue(int[] intArray)
    {
        int maxValue;
        maxValue = intArray[0];

        for (int index = 1; index < intArray.length; index ++)
        {
            if (index < intArray.length - 1)
            {
                if (intArray[index] > maxValue)
                {
                    maxValue = intArray[index];
                }
            }
        }
        return maxValue;
    }

    public static int minValue(int[] intArray)
    {
        int minValue;
        minValue = intArray[0];

        for (int index = 1; index < intArray.length; index ++)
        {
            if (index < intArray.length - 1)
            {
                if (intArray[index] < minValue)
                {
                    minValue = intArray[index];
                }
            }
        }
        return minValue;
    }
}
