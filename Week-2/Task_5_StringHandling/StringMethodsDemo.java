package task5_string_handling;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String name = "Mehroz";
        String friend = "Mehroz";

        System.out.println("Length of name: " + name.length());
        System.out.println("Substring of name: " + name.substring(0, 3));
        System.out.println("Are names equal? " + name.equals(friend));
        System.out.println("Concatenation: " + name.concat(" & ").concat(friend));
    }
}