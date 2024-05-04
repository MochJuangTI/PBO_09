package example;

public class endsWithString {

    public static void main(String[] args) {
        String string1 = "Hello how are you";
        System.out.println("the result is: " + string1.endsWith("u"));
        System.out.println("the result is: " + string1.endsWith("o"));
        System.out.println("the result is: " + string1.endsWith("you"));
        System.out.println("the result is: " + string1.endsWith("hou"));
    }
 }
