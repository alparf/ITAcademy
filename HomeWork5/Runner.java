package HomeWork5;

import HomeWork5.Constants.FileConstant;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        File file = new File(FileConstant.PATH + File.separator + FileConstant.FILE_NAME);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        if(file.exists()) {
        }
        Set<String> words = new LinkedHashSet<>();
    }
}
