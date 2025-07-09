import java.util.Scanner;

public class VariablePractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("성별을 입력하세요(남/여) : ");
        String gender = sc.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("키를 입력하세요(cm) : ");
        double height = Double.parseDouble(sc.nextLine());

        StringBuilder sb = new StringBuilder();
        sb.append("키가 ").append(height).append("cm인 ")
                .append(age).append("살 ")
                .append(gender.equals("남") ? "남자" : "여자").append(' ')
                .append(name).append("님 반갑습니다!");

        System.out.println(sb);
    }
}
