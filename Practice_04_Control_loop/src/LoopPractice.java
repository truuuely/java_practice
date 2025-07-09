import java.util.Scanner;

public class LoopPractice {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LoopPractice lp = new LoopPractice();
        lp.practice1();
        lp.practice2();
        lp.practice3();
        lp.practice4();
        lp.practice5();
        lp.practice6();
        lp.practice7();
        lp.practice8();
        lp.practice9();
    }

    public void practice1(){
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int n = Integer.parseInt(sc.nextLine());

        if (isNotValid(n)) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public void practice2(){
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int n = Integer.parseInt(sc.nextLine());

        if (isNotValid(n)) {
            return;
        }

        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public void practice3(){
        System.out.print("정수를 하나 입력하세요 : ");
        int n = Integer.parseInt(sc.nextLine());

        if (isNotValid(n)) {
            return;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    public void practice4(){
        System.out.print("첫 번째 숫자 : ");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.print("두 번째 숫자 : ");
        int n2 = Integer.parseInt(sc.nextLine());

        if (isNotValid(n1) || isNotValid(n2)) {
            return;
        }

        for (int i = Math.min(n1, n2); i <= Math.max(n1, n2); i++) {
            System.out.print(i + " ");
        }
    }

    public void practice5() {
        System.out.print("숫자 : ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.printf("===== %d단 =====\n", n);

        for (int i = 0; i < 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i + 1, n * (i + 1));
        }
    }

    public void practice6() {
        System.out.print("숫자 : ");
        int n = Integer.parseInt(sc.nextLine());

        if (n > 9) {
            System.out.println("9 이하의 숫자만 입력해주세요.");
            return;
        }

        for (int i = n; i <= 9; i++) {
            System.out.printf("===== %d단 =====\n", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }

    public void practice7() {
        System.out.print("시작 숫자 : ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("공차 : ");
        int diff = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < 10; i++) {
            System.out.print(n + diff * i + " ");
        }
    }

    public void practice8() {
        System.out.print("정수 입력 : ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void practice9() {
        System.out.print("정수 입력 : ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private boolean isNotValid(int n) {
        if (n < 1) {
            System.out.println("1 이상의 숫자를 입력해주세요.");
            return true;
        }
        return false;
    }
}
