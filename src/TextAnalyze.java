import java.util.LinkedList;

public class TextAnalyze {

    private String input = "(one{two[three]four-five)";

    LinkedList<String> storingDeque = new LinkedList<String>();


    void checkOpeningBracket() throws Exception {


        if (input.contains("(") & input.contains("{") & input.contains("[")) {
            storingDeque.push("(");
            storingDeque.push("{");
            storingDeque.push("[");
        } else if ((input.contains(")")) || (input.contains("}")) || (input.contains("]")))
            throw new Exception("The opening bracket is missing!");

        System.out.println(storingDeque.toString());


    }

    void checkClosingBracket() throws Exception {

        if ((input.contains(")") & storingDeque.peek() == "(") |
                (input.contains("}") & storingDeque.peek() == "{")
                | (input.contains("]") & storingDeque.peek() == "[")) {
            return;
        } else throw new Exception("The closing parenthesis is missing!");

    }

    public static void main(String[] args) throws Exception {
        TextAnalyze ta = new TextAnalyze();

        ta.checkOpeningBracket();
        ta.checkClosingBracket();

    }
}
