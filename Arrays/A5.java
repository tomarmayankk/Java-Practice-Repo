package Arrays;
//find the subarray for the given sum
public class A5 {
    public static void subarray(int arr[], int n, int sum){
        for(int i = 0; i < n; i++){
            int currsum = arr[i];
            if(currsum == sum){
                System.out.println("the sub array is" + i);
            }
            else { 
            for(int j = i+1; j<n; j++){
                currsum += arr[j];
                if(currsum == sum){
                    System.out.println("the sum found between index" 
                    + i + "and" + j);
                    return;
                }
            }
        }
        }
        System.out.println("no aub array found");
        return;
    }
    
    public static void main(String[] args){
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 15;
        subarray(arr, n, sum);
    }
}