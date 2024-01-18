package DSA_Questions.Arrays;
public class Arr1{
    //java program to reverse an array
    public static void reversearr(int[] array, int start, int end){
        int temp;
        if(array[start] >= array[end]){
            return;
        }
        temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reversearr(array, start+1, end-1);
    }
    public static void printarr(int array[], int size){
        for(int i=0; i<size; i++){
            System.out.print(array[i] +" ");
            System.out.print( " ");
        }

    }
    public static void main(String[] args){
        int array[]= {1,2,3,4,5,6,7};
        reversearr(array, 0, 6);
        System.out.println("Reversed array is");
        printarr(array, 7);
    }
}