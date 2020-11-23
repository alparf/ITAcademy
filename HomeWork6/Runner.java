package HomeWork6;

import HomeWork6.Search.EasySearch;
import HomeWork6.Search.RegExSearch;

import static HomeWork6.Constants.FileConstant.*;

import java.io.*;
import java.util.concurrent.Callable;

public class Runner {

    public static void main(String[] args) {
        String absolutePath = new File("").getAbsolutePath();
        File file = new File(absolutePath + File.separator +
                CATALOG + File.separator + SOURCE + File.separator + FILE);
        final String[] LOOKING_FOR = new String[] {"война", "и", "мир"};
        final int WAR = 0, AND = 1, PEACE = 2;
        final int parts = 4;
        String[] text = TxtFileReader.fileToStringArray(file, parts);
        Thread[] threads = new Thread[parts];
        long counter = 0;
        //Лямбдой
        try {
            for(int i = 0; i < parts; i++) {
                int index = i;
                Callable<Long> callable = () -> {
                    return new EasySearch().search(text[index], LOOKING_FOR[WAR]);
                };
                counter += callable.call();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("EasySearch:");
        System.out.println(LOOKING_FOR[WAR] + " = " + counter);
        //Обычным классом
        counter = 0;
        try {
            SearchTask[] tasks = new SearchTask[parts];
            for(int i = 0; i < parts; i++) {
                tasks[i] = new SearchTask(new RegExSearch(), text[i], LOOKING_FOR[WAR]);
                counter += tasks[i].call();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nRegExSearch:");
        System.out.println(LOOKING_FOR[WAR] + " = " + counter);
    }
}