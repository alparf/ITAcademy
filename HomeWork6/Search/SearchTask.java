package HomeWork6.Search;

import static HomeWork6.Beans.CaseFlag.*;

import HomeWork6.Beans.CaseFlag;
import HomeWork6.Interface.ISearchEngine;
import java.util.concurrent.Callable;

public class SearchTask implements Callable<Long> {

    private ISearchEngine searchEngine;
    private String text;
    private String word;
    private CaseFlag flag;

    public SearchTask(ISearchEngine searchEngine, String text, String word, CaseFlag flag) {
        this.searchEngine = searchEngine;
        this.text = text;
        this.word = word;
        this.flag = flag;
    }
    public SearchTask(ISearchEngine searchEngine, String text, String word) {
        this.searchEngine = searchEngine;
        this.text = text;
        this.word = word;
        this.flag = DEFAULT_CASE;
    }

    @Override
    public Long call() throws Exception {
        switch (flag) {
            case DEFAULT_CASE: {
                return searchEngine.search(this.text, this.word);
            }
            case IGNORE_CASE: {
                return searchEngine.search(this.text.toLowerCase(), this.word.toLowerCase());
            }
            default: {
                return 0L;
            }
        }
    }
}
