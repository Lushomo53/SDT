package lexer;

/**
 * Enum that represents token type.
 * Used to differentiate the different tokens the lexical parser returns
 */

public enum TokenType {
    NUM,
    ID,
    EOF,
    OPERATOR;

    public static boolean isOperator(char ch) {
        for (OperatorType ot : OperatorType.values()) {
            if (ot.getSymbol() == ch) return true;
        }

        return false;
    }

    //inner class to specify operators...also contains a field for their respective symbols
    public enum OperatorType {
        PLUS('+'),
        MINUS('-'),
        MUL('*'),
        DIV('/'),
        LPAREN('('),
        RPAREN(')');

        private final char symbol;

        OperatorType(char symbol) {
            this.symbol = symbol;
        }

        public char getSymbol() { return symbol; }
    }
}