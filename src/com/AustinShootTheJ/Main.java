package com.AustinShootTheJ;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    sortArray(getIntegers(5));
    }


    public static int[] getIntegers(int number){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " value is " + array[i]);
        }
    }

    // values makes a copy of the array passed into the method. Then a for loop is used to iterate through the array
    // and a nested for loop is used to sort the array. The variable J is used to compare i to i+1 while keeping
    // the loop in bounds, while the int a is used as a third party to swap values if i < j. 

    public static int[]sortArray(int[] array){
        int[] values = array;
        for(int i=0; i<values.length; i++){
            for(int j = i+1; j<values.length; j++ ){
                if(values[i] < values[j]){
                    int a = values[i];
                    values[i] = values[j];
                    values[j] = a;
                }
            }
        }
        printArray(values);
        return values;
    }



}
