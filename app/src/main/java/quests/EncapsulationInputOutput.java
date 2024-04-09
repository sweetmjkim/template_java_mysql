// - 두 정수 받아 사칙연산 중 (/, %) 결과 출력
// - *Main.java : call method 만 있음.
// - *InputOutput.java : 입력,출력 method
// - *Sub.java : 사칙연산 method, Set/Get 적용
// - try_catch 모든 method 사용 : 필요 시 대응문 적용
// 입력 예제) [3 / 0], [50 / 4]

package quests;

import java.util.HashMap;
import java.util.Scanner;

public class EncapsulationInputOutput {
    public HashMap<String, Integer> encapsulationInput() { // 출력 메소드
        HashMap<String, Integer> inputValues = new HashMap<>(); // 입력된 값을 HaspMap으로 담음

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("firstNumber : ");
            int firstNumber = scanner.nextInt();
            System.out.print("secondNumber : ");
            int secondNumber = scanner.nextInt();

            inputValues.put("firstNumber", firstNumber);
            inputValues.put("secondNumber", secondNumber);

        } catch (Exception e) {
            System.out.println("catch (Exception e) : " + e.getMessage());
        }
        scanner.close();
        return inputValues;
    }

    // 출력 메소드
    public void encapsulationOutput(int divide, int rest) {
        System.out.println("Division: " + divide);
        System.out.println("Remainder: " + rest);
    }
}