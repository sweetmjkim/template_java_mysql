// - 두 정수 받아 사칙연산 중 (/, %) 결과 출력
// - *Main.java : call method 만 있음.
// - *InputOutput.java : 입력,출력 method
// - *Sub.java : 사칙연산 method, Set/Get 적용
// - try_catch 모든 method 사용 : 필요 시 대응문 적용
// 입력 예제) [3 / 0], [50 / 4]

package quests;

import java.util.HashMap;

public class EncapsulationMain {
    public static void main(String[] args) {
        // 입력 받기
        EncapsulationInputOutput inputOutput = new EncapsulationInputOutput(); // ArithmeticsInputOutput의 클래스의 객체를 생성
        HashMap<String, Integer> inputValues = inputOutput.encapsulationInput(); // ArithmeticsInputOutput클래스의
                                                                                 // arithmeticsInput 메소드를 호출하여 사용자로부터
                                                                                 // 입력(HashMap 객체를 반환)

        // 사칙연산
        EncapsulationSub subs = new EncapsulationSub(); // ArithmeticsSub 클래스의 객체를 생성
        int divide = subs.encapsulationDivide(inputValues);
        int rest = subs.encapsulationRest(inputValues);

        // 출력
        inputOutput.encapsulationOutput(divide, rest);
    }
}
