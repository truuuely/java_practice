import java.util.Scanner;

public class OperatorPractice {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        OperatorPractice op = new OperatorPractice();
        op.practice1();
        op.practice2();
        op.practice3();
        op.practice4();
    }

    public void practice1(){
        System.out.print("인원 수 : ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("사탕 개수 : ");
        int candies = Integer.parseInt(sc.nextLine());

        System.out.println("1인당 사탕 개수 : " + candies / n);
        System.out.println("남는 사탕 개수 : " + candies % n);
    }

    public void practice2(){
        System.out.print("정수 : ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(n > 0 ? "양수다" : "양수가 아니다");
    }

    public void practice3(){
        System.out.print("정수 : ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(n > 0 ? "양수다" : n == 0 ? "0이다" : "음수다");
    }

    public void practice4(){
        System.out.print("정수 : ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(n % 2 == 0 ? "짝수다" : "홀수다");
    }
}
