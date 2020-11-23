package HomeWork6;

import HomeWork6.Interface.ISearchEngine;
import HomeWork6.Search.EasySearch;
import HomeWork6.Search.RegExSearch;

import static HomeWork6.Constants.FileConstant.*;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class Runner {
    private static long getCounter(List<Future<Long>> futures) throws ExecutionException, InterruptedException {
        long counter = 0;
        Iterator<Future<Long>> itr = futures.iterator();
        while (!futures.isEmpty()) {
            while (itr.hasNext()) {
                counter += itr.next().get();
                itr.remove();
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String absolutePath = new File("").getAbsolutePath();
        File file = new File(absolutePath + File.separator +
                CATALOG + File.separator + SOURCE + File.separator + FILE);
        final String[] LOOKING_FOR = new String[] {"война", "и", "мир"};
        final int WAR = 0, AND = 1, PEACE = 2;
        final int parts = 4;
        String[] text = TxtFileReader.fileToStringArray(file, parts);
        final ISearchEngine easySearch = new EasySearch();
        long counter = 0;
        //Лямбдой
        try {
            for(int i = 0; i < parts; i++) {
                int index = i;
                Callable<Long> callable = () -> {
                    return easySearch.search(text[index], LOOKING_FOR[WAR]);
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
        final ISearchEngine regExSearch = new RegExSearch();
        try {
            SearchTask[] tasks = new SearchTask[parts];
            for(int i = 0; i < parts; i++) {
                tasks[i] = new SearchTask(regExSearch, text[i], LOOKING_FOR[WAR]);
                counter += tasks[i].call();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nRegExSearch:");
        System.out.println(LOOKING_FOR[WAR] + " = " + counter);
        //ExecutorService
        System.out.println("\nExecutorService:");
        List<Future<Long>> warFutures = new LinkedList<>();
        List<Future<Long>> andFutures = new LinkedList<>();
        List<Future<Long>> peaceFutures = new LinkedList<>();
        ExecutorService service = Executors.newFixedThreadPool(parts);
        try {
            for(int i = 0; i < parts; i++) {
                warFutures.add(service.submit(new SearchTask(regExSearch, text[i].toLowerCase(), LOOKING_FOR[WAR])));
                andFutures.add(service.submit(new SearchTask(regExSearch, text[i].toLowerCase(), LOOKING_FOR[AND])));
                peaceFutures.add(service.submit(new SearchTask(regExSearch, text[i].toLowerCase(), LOOKING_FOR[PEACE])));
            }
            System.out.println(LOOKING_FOR[WAR] + " = " + getCounter(warFutures));
            System.out.println(LOOKING_FOR[AND] + " = " + getCounter(andFutures));
            System.out.println(LOOKING_FOR[PEACE] + " = " + getCounter(peaceFutures));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}