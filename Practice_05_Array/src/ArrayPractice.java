import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayPractice ap = new ArrayPractice();
//        ap.practice1();
//        ap.practice2();
//        ap.practice3();
//        ap.practice4();
//        ap.practice5();
//        ap.practice6();
//        ap.practice7();
//        ap.practice8();
//        ap.practice9();
        ap.practice10();
    }

    public void practice1() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void practice2() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 - i;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void practice3() {
        System.out.print("양의 정수 : ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void practice4() {
        String[] strings = new String[]{"사과", "귤", "포도", "복숭아", "참외"};
        System.out.println(strings[1]);
    }

    public void practice5() {
        System.out.print("문자열 : ");
        String str = sc.nextLine();

        System.out.print("문자 : ");
        char c = sc.nextLine().charAt(0);

        System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, c);

        char[] charArray = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                cnt += 1;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.printf("%c 개수 : %d", c, cnt);
    }

    public void practice6() {
        System.out.print("정수 : ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.println();
        System.out.println("총 합 : " + sum);
    }

    public void practice7() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void practice8() {
        int[] arr = new int[10];

        int max = -1;
        int min = 11;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;

            System.out.print(arr[i] + " ");

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("\n최대값 : " + max);
        System.out.println("최소값 : " + min);

    }

    public void practice9() {
        int[] arr = new int[10];

        int cnt = 0;
        while (cnt < arr.length) {
            boolean exist = false;
            int random = (int) (Math.random() * 10) + 1;
            for (int i = 0; i < cnt; i++) {
                if (arr[i] == random) {
                    exist = true;
                    break;
                }
            }

            if (exist) {
                continue;
            }

            arr[cnt] = random;
            cnt += 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void practice10() {
        int[] arr = new int[6];
        Random random = new Random();

        int cnt = 0;
        while (cnt < arr.length) {
            boolean exist = false;
            int n = random.nextInt(45) + 1;

            for (int i = 0; i < cnt; i++) {
                if (arr[i] == n) {
                    exist = true;
                    break;
                }
            }

            if (exist) {
                continue;
            }

            arr[cnt] = n;
            cnt += 1;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
