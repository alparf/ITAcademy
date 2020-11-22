package HomeWork6.Constants;

public class LineConstant {
    public static final String SPACE = " ";
    public static final char CHAR_SPACE = ' ';
    public static final String DASH = "--";
    public static final char EMPTY_CHAR;
    public static final String EMPTY_STRING;
    public static final char[] PUNCTUATION_MARKS;

    static {
        EMPTY_CHAR = (char) 0;
        EMPTY_STRING = new String();
        PUNCTUATION_MARKS = new char[] {'.', ',',';', ':', '"', '(', ')', '!', '?'};
    }
}
