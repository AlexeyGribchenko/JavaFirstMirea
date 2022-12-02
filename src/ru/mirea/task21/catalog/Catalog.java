package ru.mirea.task21.catalog;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Catalog {

    public static ArrayList<File> findFiles(String stPAth) throws IOException {
        ArrayList<File> alFiles = new ArrayList<>();

        for (Path path : Files.walk(Paths.get(stPAth)).filter(Files::isRegularFile).toList()) {
            alFiles.add(new File(path.toUri()));
        }
        return alFiles;
    }

    public static String readFile(File file) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream(file);
        String stResult = "";

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stResult += line;
                stResult += "\n";
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stResult;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<File> alFiles = findFiles("C:\\Users\\_ADMIN_\\Desktop\\files");
        for (int i = 0; i < alFiles.size() && i < 5; i++) {
            System.out.println(alFiles.get(i).getName());
        }

        for (int i = 0; i < alFiles.size() && i < 5; i++) {
            System.out.println("!---File: " + alFiles.get(i).getName() + "---!\n");
            System.out.println(readFile(alFiles.get(i)));
            System.out.println();
        }
    }
}