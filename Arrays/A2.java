package Arrays;
import java.util.Scanner;
//this file will help you to solve a question on array
public class A2 {
    //Question - take the array as input from the user and search for the value of x in the array, also find the maximum value and min value
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = Sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array");

        for(int i = 0; i < size; i++){
            arr[i] = Sc.nextInt();
        }
        int x = Sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]){
                System.out.println("x found at" + i);
            }
        }
        //to find the max and min values
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i = 0; i <arr.length; i++) {
            if(arr[i] > max)
             max = arr[i];
            System.out.println("maximum value: " + max);
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
                System.out.println("minimum value:" + min);
            }
        }
        // part 2 - now check the array is ascending or descending

        Boolean isAscending = true;

        for (int i = 0; i <arr.length -1; i++) {
            if(arr[i] > arr[i +1]) {
                isAscending = false;
        }
        if(isAscending) {
            System.out.println("the given array is in descending order");
        }
        else {
            System.out.println("the given array is in ascending order");
        }

        Sc.close();
    }
}
}
