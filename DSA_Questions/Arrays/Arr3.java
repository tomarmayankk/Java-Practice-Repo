package DSA_Questions.Arrays;
import java.util.Arrays;
//check whether that the array conatins duplicates or not
public class Arr3 {
    public boolean containsDuplicates(int[] arr){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7};
        Arr3 arrChecker = new Arr3();
        boolean hasDuplicates = arrChecker.containsDuplicates(arr);

        if (hasDuplicates) {
            System.out.println("Array contains duplicates.");
        } else {
            System.out.println("Array does not contain duplicates.");
        }
    }
}
