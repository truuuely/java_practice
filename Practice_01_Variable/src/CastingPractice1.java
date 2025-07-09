import java.util.Scanner;

public class CastingPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자 : ");
        char c = sc.nextLine().charAt(0);

        System.out.print(c + " unicode : " + (int) c);
    }
}
