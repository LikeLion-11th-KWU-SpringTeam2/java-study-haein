import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        int i=0;

        String str2="";
        while(i<str1.length()){
            if(Character.isUpperCase(str1.charAt(i)))str2+=Character.toLowerCase(str1.charAt(i));
            else str2+=Character.toUpperCase(str1.charAt(i));
            i++;
        }
        System.out.println(str2);
    }
}