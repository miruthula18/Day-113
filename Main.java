import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        sb.reverse();

        System.out.println("Reversed word: " + sb);

        sc.close();
    }
}
