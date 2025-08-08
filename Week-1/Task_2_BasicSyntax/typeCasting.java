package task2_syntax;

public class typeCasting {
    public static void main(String[] args) {
        
        int intNum = 10;
        double doubleNum = intNum; // int -> double 
        System.out.println("Implicit Casting (int to double): " + doubleNum);

        double myDouble = 9.78;
        int myInt = (int) myDouble; // double -> int 
        System.out.println("Explicit Casting (double to int): " + myInt);

        char letter = 'A';
        int letterAscii = letter; // char -> int
        System.out.println("Char to int (ASCII value of 'A'): " + letterAscii);

        int asciiValue = 66;
        char convertedChar = (char) asciiValue; // int -> char
        System.out.println("Int to char (ASCII 66): " + convertedChar);
    }
}
