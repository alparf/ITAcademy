package HomeWork5.Beans;

import HomeWork5.Interface.ISearchEngine;

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
