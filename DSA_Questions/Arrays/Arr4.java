package DSA_Questions.Arrays;
import java.util.Arrays;
//chocolate distribution problem
public class Arr4 {
    public static int distributeChocolates(int[] packets, int students) {
        if (packets == null || students <= 0 || packets.length < students) {
            return -1; // Invalid input
        }

        Arrays.sort(packets);

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i + students - 1 < packets.length; i++) {
            int currentDifference = packets[i + students - 1] - packets[i];
            minDifference = Math.min(minDifference, currentDifference);
        }

        return minDifference;
    }

    public static void main(String[] args) {
        int[] packets = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int students = 7;

        int minDifference = distributeChocolates(packets, students);

        if (minDifference != -1) {
            System.out.println("Minimum difference between maximum and minimum chocolates: " + minDifference);
        } else {
            System.out.println("Invalid input.");
        }
    }
}
