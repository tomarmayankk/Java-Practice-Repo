package Arrays;
public class  A3 {

    public static double findMean(int[] arr, int index, double sum, int n){
      if (index == n) {
        return sum / n;
      }
      return findMean(arr, index + 1, sum + arr[index], n);
    }
  
    public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      int n = arr.length;
  
      double mean = findMean(arr, 0, 0, n);
      System.out.println("Mean of the array: " + mean);
    }
  }
