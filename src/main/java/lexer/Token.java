package lexer;

/**
 * Token class represents a single token for that represents an atomic entity of an expression;
 * that is: numbers, operators and special characters.
 * Each token has a type (number, identifier, operator and eof) as well as a value.
 * Value for identifies -> string, numbers -> Double, operators -> OperatorType and EOF -> null
 */
public class Token {
    public TokenType tokenType;
    public Object value;

    public Token(TokenType tokenType, Object value) {
        this.tokenType = tokenType;
        this.value = value;
    }

    //constructor for EOF (null value)
    public Token(TokenType tokenType) {
        this(tokenType, null);
    }

    @Override
    public String toString() {
        return tokenType.toString() + ": " + value;
    }
}
