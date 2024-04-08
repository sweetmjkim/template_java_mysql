package co_templates;

public class MethodsSubs {
    public void MethodsSubs(){
        System.out.println("MethodsSubs - MethodsSubs()");
    }
    // 접근자 리턴 메소드이름(파라메터){
    //      return 0;
    // }
    public void methoodsSubs(){
        System.out.println("Methodssubs - methodsSubs()");
    }

    // with params
    public void methodsSubsWithParams(String fname, int count){
        System.out.println("MethodsSubs - methodsSubsWithParams(string fname)");
        System.out.println("params : fname-"+fname);
        return ;
    }
    // with params
    public int methodsSubsWithParamsReturn(int firstNumber, int secondNumber){
        System.out.println("MethodsSubs - methodsSubsWithParamsReturn(int firstNumber, int secondNumber)");
        System.out.println("params : firstNumber-"+firstNumber+", secondNumber-"+secondNumber);
        int resultNumber = firstNumber + secondNumber;
        return resultNumber;
    }
}
