package Recursion;
public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char source, char helper, char destination){
        if(n==1){
            System.out.println("Move disk 1 from " + source + " to " + destination);
        }
        else{
            towerOfHanoi(n-1, source, destination, helper);
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            towerOfHanoi(n-1, helper, source, destination);
        }
    }
    public static void main(String[] args){
        towerOfHanoi(4, 'A', 'C', 'B');


    }
    
}
