// ref : https://github.com/sweetmjkim/study_javas/blob/main/src/quests/Additions.java

// 값이 미리 입력된 경우
// package quests;

// public class AdditionsMain {
//     public static void main(String[] args){
//         AdditionsSub subs = new AdditionsSub();
//         int answer = subs.AdditionsSubWithParamsReturn(1, 2);
//         return ;
//     }    
// }


// 값을 넣는 경우
package quests;

public class AdditionsMain {
    public static void main(String[] args){
        AdditionsSub subs = new AdditionsSub();
        int intAnswer = subs.addAndPrintResult();
        System.out.println("최종 결과 : " + intAnswer);
        subs.scannerClose();        // Scanner 객체를 닫는 메서드
    }    
}
