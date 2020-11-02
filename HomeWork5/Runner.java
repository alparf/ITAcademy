package HomeWork5;

import HomeWork5.Search.EasySearch;
import HomeWork5.Search.RegExSearch;

import static HomeWork5.Constants.FileConstant.*;

import java.io.*;
import java.util.*;

public class Runner {

    public static void main(String[] args) {
        String absolutePath = new File("").getAbsolutePath();
        File file = new File(absolutePath + File.separator +
                CATALOG + File.separator + SOURCE + File.separator + FILE);
        Set<String> set = TxtFileReader.getWords(file);
        System.out.println("setWords size: " + set.size());
        System.out.println(set);
        Map<String, Integer> map = TxtFileReader.getWordCounters(file);
        Map<Integer, StringBuilder> sortedMap = TxtFileReader.getTop(map);
        int counter = 0;
        System.out.print("\nTop 10 words: ");
        for(Integer amount: sortedMap.keySet()) {
            System.out.print(sortedMap.get(amount) + " = " + amount + " раз; ");
            counter++;
            if(counter >= 10) {
                break;
            }
        }
        System.out.println("\n\nEasySearch: ");
        EasySearch easySearch = new EasySearch();
        System.out.println("война = " + easySearch.search(TxtFileReader.fileToString(file), "война"));
        System.out.println("\nRegExSearch: ");
        RegExSearch regExSearch = new RegExSearch();
        System.out.println("война = " + regExSearch.search(TxtFileReader.fileToString(file), "война"));
        System.out.println("\nIgnore case search:");
        final String[] LOOKING_FOR = new String[] {"ВОЙНА", "И", "МИР"};
        final int WAR = 0, AND = 1, PEACE = 2;
        System.out.println("\nEasySearch:");
        String upperCaseText = TxtFileReader.fileToString(file).toUpperCase();
        System.out.println("война = " + easySearch.search(upperCaseText, LOOKING_FOR[WAR]));
        System.out.println("и = " + easySearch.search(upperCaseText, LOOKING_FOR[AND]));
        System.out.println("мир = " + easySearch.search(upperCaseText, LOOKING_FOR[PEACE]));
        System.out.println("\nRegExSearch:");
        System.out.println("война = " + regExSearch.search(upperCaseText, LOOKING_FOR[WAR]));
        System.out.println("и = " + regExSearch.search(upperCaseText, LOOKING_FOR[AND]));
        System.out.println("мир = " + regExSearch.search(upperCaseText, LOOKING_FOR[PEACE]));
    }
}