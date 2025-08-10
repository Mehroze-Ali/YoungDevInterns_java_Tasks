package task5_string_handling;

import java.util.Scanner;

public class PalindromeChecker {
    public String s;

    public boolean palindromeCheck(String s){

        boolean result;
        String rev = "";

        for(int i = s.length()-1 ; i>=0; i--){
            rev = rev + s.charAt(i);
        }

        if(rev.equals(s)){
            result = true;
        } else {
            result = false;
        }

        return result;

    }


    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");

        String s = sc.nextLine();

        if(p.palindromeCheck(s)){
            System.out.println("String is a Palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }

        sc.close();
    }
}
