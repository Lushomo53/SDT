package lexer;

import java.util.List;
//test class for the lexical parser
public class Test {
    public static void main(String[] args) {
        List<Token> tokens = new Lexer().tokenise("3 + (4 * num) - bal");
        //print each token
        tokens.forEach(System.out::println);
    }
}
