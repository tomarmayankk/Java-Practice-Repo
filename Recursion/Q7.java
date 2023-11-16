public class Q7 {
    /**********java program to find the total number of ways for inviting guests in single or pairs*********/
    public static int FindPairs(int n){
        if(n<=1){
            return 1;
        }
        //single
        int single = FindPairs(n-1);

        //double
        int pair = (n-1) * FindPairs(n-2);
        return pair + single;
    }

    public static void main(String[] args){
        int n = 4;
        System.out.println(FindPairs(n));

    }
}
