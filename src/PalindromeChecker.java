import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat atau kata: ");
        String kalimat = input.nextLine();
        boolean isPalindrome = checkPalindrome(kalimat);
        if (isPalindrome) {
            System.out.println("Kalimat atau kata adalah palindrom.");
        } else {
            System.out.println("Kalimat atau kata bukan palindrom.");
        }
    }

    public static boolean checkPalindrome(String kalimat) {
        StringBuilder sb = new StringBuilder(kalimat);
        String kalimatBalik = sb.reverse().toString();
        return kalimat.equalsIgnoreCase(kalimatBalik);
    }
}

