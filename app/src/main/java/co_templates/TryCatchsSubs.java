package co_templates;

import java.util.ArrayList;

public class TryCatchsSubs {
    public void MethodsSubs() {
        System.out.println("MethodsSubs - MethodsSubs()");
    }

    // 접근자 리턴 메소드이름(파라메터){
    // return 0;
    // }
    public void methoodsSubs() {
        System.out.println("Methodssubs - methodsSubs()");
    }

    // with params
    public void methodsSubsWithParams(String fname, int count) {
        System.out.println("MethodsSubs - methodsSubsWithParams(string fname)");
        System.out.println("params : fname-" + fname);
        return;
    }

    // with params
    public int methodsSubsWithParamsReturn(int firstNumber, int secondNumber) {
        int resultNumber = 0;
        try {
            System.out.println("MethodsSubs - methodsSubsWithParamsReturn(int firstNumber, int secondNumber)");
            System.out.println("params : firstNumber-" + firstNumber + ", secondNumber-" + secondNumber);
            resultNumber = firstNumber + secondNumber;
        } catch (Exception e) {
            // Block of code to handle errors
            System.out.println("methodsSubsWithParamsReturn(int firstNumber, int secondNumber)");
        }
        return resultNumber;
    }

    public int returnException(int firstNumber) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);

        int result = 0;
        try {
            System.out.println(myNumbers.get(10));
            result = myNumbers.get(10);
        } catch (Exception e) {
            System.out.println("catch (Exception e): "+e.getMessage());
            result = myNumbers.get(0);
        }
        return result ;
    }
}
