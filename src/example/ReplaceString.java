package example;

public class ReplaceString {
    public static void main(String[] args) {
        String string1 = "Hello how are you";
        String changechar = string1.replace("H", "I");
        String changeSentence = string1.replace("Hello", "Good Morning");
        System.out.println("To replace character: " + changechar);
        System.out.println("To replace sentence: " + changeSentence);
    }
}
