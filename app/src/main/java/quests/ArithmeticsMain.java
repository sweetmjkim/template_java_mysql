// - 두 정수 받아 사칙연산(+-*%나머지) 결과 출력
// - main엔 method call만 있음.
// - 입력,출력 기능 method로 작성
// - try_catch문 모든 method에 사용
// 입력 예제) [3 / 0], [50 / 4]

package quests;

import java.util.HashMap;

public class ArithmeticsMain {
    public static void main(String[] args) {
        // 입력 받기
        ArithmeticsInputOutput inputOutput = new ArithmeticsInputOutput(); // ArithmeticsInputOutput의 클래스의 객체를 생성
        HashMap<String, Integer> inputValues = inputOutput.arithmeticsInput(); // ArithmeticsInputOutput클래스의
                                                                               // arithmeticsInput 메소드를 호출하여 사용자로부터
                                                                               // 입력(HashMap 객체를 반환)

        // 사칙연산
        ArithmeticsSub subs = new ArithmeticsSub(); // ArithmeticsSub 클래스의 객체를 생성
        int sum = subs.arithmeticsSum(inputValues); // 메소드 호출하여 계산
        int minus = subs.arithmeticsMinus(inputValues);
        int multiple = subs.arithmeticsMultiple(inputValues);
        int divide = subs.arithmeticsDivide(inputValues);
        int rest = subs.arithmeticsRest(inputValues);

        // 출력
        inputOutput.arithmeticsOutput(sum, minus, multiple, divide, rest);
    }
}