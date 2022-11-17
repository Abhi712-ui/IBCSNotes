public class RecursionPractice {
    public static void main(String[] args) {
        writeSequence(5);
    }

    public static String starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return "*";
        } else {
            return starString(n - 1) + starString(n - 1);
        }
    }

    public static void writeNums(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print(n);
        } else {
            writeNums(n - 1);
            System.out.print(", " + n);
        }
    }

    public static void writeSequence(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("1 ");
        } else {
            System.out.print((n + 1) / 2 + " ");
            if (n != 2) {
                writeSequence(n - 2);
            }
            System.out.print((n + 1) / 2 + " ");
        }
    }
}




