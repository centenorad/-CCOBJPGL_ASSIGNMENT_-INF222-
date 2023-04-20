public class App {
static boolean iWillBehave = true;
static boolean iWillGraduate = true;

    public static void main(String[] args) throws Exception {
//precondition
assert iWillBehave == true : "MAG AARAL NG MABUTI";

//method
college();

//postcondition
assert iWillGraduate ==  true : "NAKATAPOS RIN";
    }

    static void college(){

        iWillGraduate = false;

        System.out.println("ULIT KA ULIT!");
    }
}
