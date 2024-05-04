import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        String kalimatBalik = reverseString(kalimat);
        System.out.println("Kalimat setelah dibalik: " + kalimatBalik);
    }

    public static String reverseString(String kalimat) {
        StringBuilder sb = new StringBuilder(kalimat);
        return sb.reverse().toString();
    }
}