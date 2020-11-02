package HomeWork5.Constants;

public class LineConstant {
    public static final String SPACE = " ";
    public static final char EMPTY_CHAR;
    public static final String EMPTY_STRING;
    public static final char[] PUNCTUATION_MARKS = new char[] {'.', ',',';', ':', '"', '(', ')', '!', '?'};

    static {
        EMPTY_CHAR = (char) 0;
        EMPTY_STRING = new String();
    }
}
