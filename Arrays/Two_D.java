package Arrays;

import java.util.Scanner;
//Question - take a 2d array as the input from the user and search for the element x in the array

public class Two_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the input for the number of rows and columns
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // Inputting elements into the 2D array
        System.out.println("Enter the elements of the array separated by spaces:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Inputting the element to search (x)
        System.out.println("Enter the element to search:");
        int x = sc.nextInt();

        boolean found = false;

        // Searching for the element x in the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("Element " + x + " found at index [" + i + "][" + j + "]");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element " + x + " not found in the array.");
        }

        sc.close(); // Close the scanner object
    }
}
