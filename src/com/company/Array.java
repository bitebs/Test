package com.company;

public class Array {
    public static void main(Equals[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};

        //System.out.println("Average value of the array elements is : " + average);
    }

    public static double getAverageValue(int[] numbers){
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        return average;
    }
}
