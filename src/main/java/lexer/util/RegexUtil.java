package lexer.util;

import java.util.regex.Pattern;

public class RegexUtil {
    public static final Pattern VALID_IDENTIFIER = Pattern.compile("^[a-zA-Z_$][a-zA-Z0-9_$]*$");
}