public class CastingPractice3 {
    public static void main(String[] args) {
        int iNum1 = 10;
        int iNum2 = 4;
        float fNum = 3.0f;
        double dNum = 2.5;
        char ch = 'A';

        System.out.println((int) dNum); // 2
        System.out.println(iNum1 / iNum2); // 2

        System.out.println((double) iNum1); // 10.0
        System.out.println((double) iNum1 + iNum2 - (int) dNum * 2); // 10.0

        System.out.println(iNum2 * 2 - fNum - dNum); // 2.5
        System.out.println((double) iNum1 / iNum2); // 2.5

        System.out.println((int) fNum); // 3
        System.out.println((int) ((iNum2 + fNum) / (int) dNum)); // 3

        System.out.println(iNum1/fNum);// 3.3333333
        System.out.println((double) iNum1 / fNum); // 3.3333333333333335

        System.out.println(ch); // 'A'
        System.out.println((int) ch); // 65
        System.out.println( ch + iNum1 ); // 75
        System.out.println((char) (ch + iNum1)); // 'K'
    }
}
