// 값이 미리 입력된 경우
// package quests;

// public class AdditionsSub {
//         public int AdditionsSubWithParamsReturn(int intFirst, int intsecond){
//             System.out.println("AdditionsSub - AdditionsSubWithParamsReturn(int intFirst, int intsecond)");
//             System.out.println("params : intFirst-"+intFirst+", intsecond-"+intsecond);
//             int answer = intFirst + intsecond;
//             return answer;
//         }
// }


// 값을 넣는 경우
package quests;

import java.util.Scanner;

public class AdditionsSub {
    private Scanner scanner; // 클래스에 Scanner 선언

    public AdditionsSub() {
        this.scanner = new Scanner(System.in); // Scanner 초기화
    }

    public int addAndPrintResult() {
        System.out.print("첫번째 값 : ");
        int intFirst = scanner.nextInt();

        System.out.print("두번째 값 : ");
        int intSecond = scanner.nextInt();

        int intAnswer = intFirst + intSecond;
        // System.out.println("결과 : " + intAnswer);   // 첫번째, 두번째 값 결과를 미리보기

        System.out.println("AdditionsSub - addAndPrintResult()");
        System.out.println("params : intFirst-" + intFirst + ", intSecond-" + intSecond);
        return intAnswer;
    }

    public static void main(String[] args) {
        AdditionsSub additionsSub = new AdditionsSub();
        additionsSub.addAndPrintResult();
    }
}