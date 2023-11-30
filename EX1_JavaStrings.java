import java.util.Scanner;

public class EX1_JavaStrings{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int lenOfS1 = s1.length();
        int lenOfS2 = s2.length();

        //Print the length of the first string
        System.out.println("The length of the first string is "+lenOfS1);

        //Print the length of the second string
        System.out.println("The length of the second string is "+lenOfS2);

        //Print if the length matches or not
        if(lenOfS1==lenOfS2){
            System.out.println("The length of the two strings are the same");
        }
        else{
            System.out.println("The length of the two strings is not the same");
        }

        //Print if the two strings are the same
        if(s1.equals(s2)){
            System.out.println("Two strings are equal");
        }
        else{
            System.out.println("Two strings are not equal");
        }
    }

}