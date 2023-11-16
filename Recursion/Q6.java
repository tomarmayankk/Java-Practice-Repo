public class Q6{
    //***********************************program to arrange the tile of 1xm in a nxm room****************************** 
    public static int Arrangetiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertical arrangement
        int vertical = Arrangetiles(n-m, m);

        //horizontal arrangement
        int horizontal = Arrangetiles(n-1, m);

        return vertical + horizontal;
    }
    public static void main(String[] args){
        int n =4;
        int m =2;
        System.out.println(Arrangetiles(n, m));

    }

}