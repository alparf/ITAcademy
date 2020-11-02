package HomeWork5.Search;

import static HomeWork5.Constants.LineConstant.*;

import HomeWork5.Interface.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long counter = 0L;
        word = word.trim();
        word = SPACE + word + SPACE;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}
