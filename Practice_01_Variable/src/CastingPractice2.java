import java.util.Scanner;

public class CastingPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 : ");
        double korean = Double.parseDouble(sc.nextLine());
        System.out.print("영어 : ");
        double english = Double.parseDouble(sc.nextLine());
        System.out.print("수학 : ");
        double math = Double.parseDouble(sc.nextLine());
        System.out.println("총점 : " + (int) (korean + english + math));
        System.out.println("평균 : " + (int) (korean + english + math) / 3);
    }
}
