public class Main {
    public static void main(String[] args) {

        System.out.println("1). ");
        first("MOCHJUANG");
        System.out.println();
        System.out.println();

        System.out.println("2). ");
        second("MOCHJUANG");
        System.out.println();
        System.out.println();

        System.out.println("3). ");
        third("MOCHJUANG");
        System.out.println();
        System.out.println();
    }


    public static void first(String name) {
        int length = name.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print(name.charAt(j) + " ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void second(String name) {
        int length = name.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i) {
                    System.out.print(name.charAt(j) + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void third(String name) {
        var centerIndex = name.length() / 2;

        for (int i = 0; i < name.length(); i++) {
            if (i == centerIndex) {
                for (int j = 0; j < name.length(); j++) {
                    System.out.print(name.charAt(j) + " ");
                }
            } else {
                for (int j = 0; j < name.length(); j++) {
                    if (j == centerIndex) {
                        System.out.print(name.charAt(i) + " ");
                    } else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}