public class Q4 {
    //*****************************java program to print the permutation of all string************************
    public static void PrintPerm(String str, String perm) {
        if(str.length()== 0){
            
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            char current = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1);
            PrintPerm(newStr, perm+current);
        }

    }

    public static void main(String[] args){
        PrintPerm("abc", "");

    }
    
}
