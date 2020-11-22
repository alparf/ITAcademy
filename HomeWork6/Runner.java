package HomeWork6;

import static HomeWork6.Constants.FileConstant.*;

import java.io.*;

public class Runner {
    public static void main(String[] args) {
        String absolutePath = new File("").getAbsolutePath();
        File file = new File(absolutePath + File.separator +
                CATALOG + File.separator + SOURCE + File.separator + FILE);
        StringBuilder[] text = TxtFileReader.fileToStringArray(file, 4);
        for(StringBuilder part: text) {
            System.out.println(part);
        }
    }
}