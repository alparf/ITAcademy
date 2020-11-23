package HomeWork6.Beans;

import HomeWork6.Interface.ISearchEngine;

public class SearchCaseIgnore implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SearchCaseIgnore(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        return searchEngine.search(text.toLowerCase(), word.toLowerCase());
    }
}
