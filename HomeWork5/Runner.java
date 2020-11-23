package HomeWork5;

import static HomeWork5.Constants.FileConstant.*;

import HomeWork5.Beans.SearchCaseIgnore;
import HomeWork5.Search.EasySearch;
import HomeWork5.Search.RegExSearch;
import HomeWork5.Interface.ISearchEngine;

import java.io.*;
import java.util.*;

public class Runner {

    private static void printTop(int top, Map<Integer, StringBuilder> sortedMap) {
        int counter = 0;
        for(Integer amount: sortedMap.keySet()) {
            System.out.print(sortedMap.get(amount) + " = " + amount + " раз; ");
            counter++;
            if(counter >= top) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        String absolutePath = new File("").getAbsolutePath();
        File file = new File(absolutePath + File.separator +
                CATALOG + File.separator + SOURCE + File.separator + FILE);
        Set<String> set = TxtFileReader.getWords(file);
        System.out.println("word counter: " + set.size());
        Map<String, Integer> map = TxtFileReader.getWordCounters(file);
        Map<Integer, StringBuilder> sortedMap = TxtFileReader.getTop(map);
        System.out.print("\nTop words: ");
        printTop(10, sortedMap);
        String text;
        text = TxtFileReader.fileToString(file);
        System.out.println("\n\nEasySearch: ");
        EasySearch easySearch = new EasySearch();
        System.out.println("война = " + easySearch.search(text, "война"));
        System.out.println("\nRegExSearch: ");
        RegExSearch regExSearch = new RegExSearch();
        System.out.println("война = " + regExSearch.search(text, "война"));
        System.out.println("\nIgnore case search:");
        final String[] LOOKING_FOR = new String[] {"война", "и", "мир"};
        final int WAR = 0, AND = 1, PEACE = 2;
        ISearchEngine searchEngine = new SearchCaseIgnore(easySearch);
        System.out.println("\nEasySearch:");
        System.out.println("война = " + searchEngine.search(text, LOOKING_FOR[WAR]));
        System.out.println("и = " + searchEngine.search(text, LOOKING_FOR[AND]));
        System.out.println("мир = " + searchEngine.search(text, LOOKING_FOR[PEACE]));
        System.out.println("\nRegExSearch:");
        searchEngine = new SearchCaseIgnore(regExSearch);
        System.out.println("война = " + searchEngine.search(text, LOOKING_FOR[WAR]));
        System.out.println("и = " + searchEngine.search(text, LOOKING_FOR[AND]));
        System.out.println("мир = " + searchEngine.search(text, LOOKING_FOR[PEACE]));
    }
}