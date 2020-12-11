package com.ty;

import java.util.Arrays;
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        int largest = numbers[4];
        int smallest = numbers[0];

        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);

        int sum = 0;
        for (int i : numbers){
            sum += i;
        }
        System.out.println("The sum of all the numbers is " + sum);

        int product = 1;
        for (int i : numbers) {
            product *= i;
        }
        System.out.println("The product of all the numbers is " + product);

    }
}
