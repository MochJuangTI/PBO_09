package example;

public class EqualString {
    public static void main(String[] args){
        String string1 = "hello";
        String string2 = "hello";
        String string3 = "Hello";
        System.out.println("The result is: " + string1.equals(string2));
        System.out.println("The result is: " + string1.equals(string3));
    }
}
