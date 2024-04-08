package quests;

public class AdditionsSub {
        public int AdditionsSubWithParamsReturn(int intFirst, int intsecond){
            System.out.println("AdditionsSub - AdditionsSubWithParamsReturn(int intFirst, int intsecond)");
            System.out.println("params : intFirst-"+intFirst+", intsecond-"+intsecond);
            int answer = intFirst + intsecond;
            return answer;
        }
}