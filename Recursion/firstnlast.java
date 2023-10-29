package Recursion;
//java program to find the first and last occurence of a character in a string
public class firstnlast {
    public static void Firstnlast(String str, char ch){
        if(str.length()==1){
            System.out.println("First occurence of " + ch + " in " + str + " is " + str.indexOf(ch));
            System.out.println("Last occurence of " + ch + " in " + str + " is " + str.lastIndexOf(ch));
        }
        else{
            Firstnlast(str.substring(1), ch);
            System.out.println("First occurence of " + ch + " in " + str + " is " + str.indexOf(ch));
            System.out.println("Last occurence of " + ch + " in " + str + " is " + str.lastIndexOf(ch));
        }
    }
    public static void main(String[] args) {
        Firstnlast("abcd", 'a');
    }
    
}
