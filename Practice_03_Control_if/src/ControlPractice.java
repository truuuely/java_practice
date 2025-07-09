import java.util.Scanner;

public class ControlPractice {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ControlPractice cp = new ControlPractice();
        cp.practice1();
        cp.practice2();
        cp.practice3();
        cp.practice4();
        cp.practice5();
        cp.practice6();
        cp.practice7();
        cp.practice8();
    }

    public void practice1(){
        System.out.print("정수 : ");
        int n = Integer.parseInt(sc.nextLine());
        if (n > 0) {
            System.out.println("양수다");
            return;
        }

        System.out.println("양수가 아니다");
    }

    public void practice2(){
        System.out.print("정수 : ");
        int n = Integer.parseInt(sc.nextLine());
        if (n > 0) {
            System.out.println("양수다");
        } else if (n == 0) {
            System.out.println("0이다");
        } else {
            System.out.println("음수다");
        }
    }

    public void practice3(){
        System.out.print("정수 : ");
        int n = Integer.parseInt(sc.nextLine());
        if (n % 2 == 0) {
            System.out.println("짝수다");
        } else {
            System.out.println("홀수다");
        }
    }

    public void practice4(){
        System.out.print("숫자를 한 개 입력하세요 : ");
        int n = Integer.parseInt(sc.nextLine());

        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("짝수다");
            } else {
                System.out.println("홀수다");
            }
        } else {
            System.out.println("양수만 입력해주세요.");
        }
    }

    public void practice5(){
        System.out.print("주민번호를 입력하세요(- 포함) : ");
        String id = sc.nextLine();

        char c = id.charAt(7);
        if (c == '2' || c == '4') {
            System.out.println("여자");
        } else if (c == '1' || c == '3') {
            System.out.println("남자");
        }
    }

    public void practice6(){
        System.out.print("나이 : ");
        int n = Integer.parseInt(sc.nextLine());

        if (n > 19) {
            System.out.println("성인");
        } else if (n <= 13) {
            System.out.println("어린이");
        } else {
            System.out.println("청소년");
        }
    }

    public void practice7(){
        System.out.print("아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String pw = sc.nextLine();

        String userId = "test";
        String userPw = "1212";

        if (id.equals(userId)) {
            if (pw.equals(userPw)) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("아이디가 틀렸습니다.");
        }
    }

    public void practice8() {
        System.out.print("피연산자1 입력 : ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("피연산자2 입력 : ");
        int b = Integer.parseInt(sc.nextLine());

        if (a < 0 || b < 0) {
            System.out.println("양수를 입력하세요.");
            return;
        }

        System.out.print("연산자를 입력(+,-,*,/,%) : ");
        String op = sc.nextLine();

        float res = 0;
        switch (op) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a * 1.0f / b;
                break;
            case "%":
                res = a % b;
                break;
            default:
                System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
                return;
        }

        if (res % 1 == 0) {
            System.out.printf("%d %s %d = %d", a, op, b, (int) res);
            return;
        }

        System.out.printf("%d %s %d = %f", a, op, b, res);
    }
}
