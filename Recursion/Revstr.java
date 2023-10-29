package Recursion;
//java program to reverse a string
public class Revstr {
    public static void revstr(String str){
        if(str.length()==1){
            System.out.print(str);
        }
        else{
            revstr(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
    public static void main(String[] args){
        revstr("dcba");

    }
}
