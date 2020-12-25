
import java.util.LinkedList;


public class StringAnalyze {

    private String input = "(one{two[three]four}five)";

    LinkedList<String> storingDeque = new LinkedList<String>();


    void checkOpeningBracket() throws Exception {


        if (input.contains("(")) {
            storingDeque.push("(");
        } else if (input.contains(")")) throw new Exception("The opening bracket '(' is missing!");

        if (input.contains("{")) {
            storingDeque.push("{");
        } else if (input.contains("}")) throw new Exception("The opening bracket '{' is missing!");

        if (input.contains("[")) {
            storingDeque.push("[");
        } else if (input.contains("]")) throw new Exception("The opening bracket '[' is missing!");


    }

    void checkClosingBracket() throws Exception {

        if (input.contains(")") & storingDeque.contains("(")) {
            storingDeque.remove("(");
        } else throw new Exception("The closing parenthesis ')' is missing!");

        if (input.contains("}") & storingDeque.contains("{")) {
            storingDeque.remove("{");
        } else throw new Exception("The closing parenthesis '}' is missing!");

        if (input.contains("]") & storingDeque.contains("[")) {
            storingDeque.remove("[");
        } else throw new Exception("The closing parenthesis ']' is missing!");


    }

    public static void main(String[] args) throws Exception {
        StringAnalyze sa = new StringAnalyze();

        sa.checkOpeningBracket();
        sa.checkClosingBracket();
    }

}
