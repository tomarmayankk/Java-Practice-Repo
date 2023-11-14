// *********************************java program to find the total number of paths in a maze to move from (0,0) to (n,m)************
public class Q5 {
    public static int getTotalNumberOfPaths(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i == n-1 && j == m-1 ){
            return 1;
        }



        //move downwars
        int downpath = getTotalNumberOfPaths(i+1, j, n, m);

        //mover rightward

        int rightpath = getTotalNumberOfPaths(i, j+1, n, m);
        return rightpath + downpath;
    }

    public static void main(String[] args){
        int n =3; 
        int m =3;

        int totalpaths  = getTotalNumberOfPaths(0, 0, n, m);
        System.out.println(totalpaths);

    }
    
}
