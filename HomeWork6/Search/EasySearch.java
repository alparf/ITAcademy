package HomeWork6.Search;

import static HomeWork5.Constants.LineConstant.*;

import HomeWork6.Interface.ISearchEngine;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long counter = 0L;
        int lastIndex = 0;
        int indexOf;
        if ((null != word) && (null != text)) {
            word = word.trim();
            word = SPACE + word + SPACE;
            while ((indexOf = text.indexOf(word, lastIndex)) != -1) {
                lastIndex = indexOf + word.length();
                counter++;
            }
        }
        return counter;
    }
}
