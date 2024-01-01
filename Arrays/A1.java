//java program to practice arrays 
package Arrays;

public class A1 {
    public static void main(String[] args){
        
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        //loop to print all the index at  time
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            //we can create the array in more simple way (given below)
            //int arr[] = {1, 2, 3};
        }
    }
    
}
