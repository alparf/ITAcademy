package HomeWork6.Search;

import HomeWork6.Interface.ISearchEngine;
import java.util.concurrent.Callable;

public class SearchTask implements Callable<Long> {

    private ISearchEngine searchEngine;
    private String text;
    private String word;

    public SearchTask(ISearchEngine searchEngine, String text, String word) {
        this.searchEngine = searchEngine;
        this.text = text;
        this.word = word;
    }

    @Override
    public Long call() throws Exception {
        return this.searchEngine.search(this.text, this.word);
    }
}
