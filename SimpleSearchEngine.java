import java.lang.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleSearchEngine {

    public static void main(String[] args) {
        String searchQuery = "yourSearchString";
        File currentFolder = new File(".");
        
        // Using a thread pool to manage multiple search threads
        ExecutorService executorService = Executors.newCachedThreadPool();

        // List all text files in the current folder
        File[] files = currentFolder.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

        if (files != null) {
            for (File file : files) {
                // Start a new thread for each file
                executorService.execute(new SearchTask(file, searchQuery));
            }
        }

        // Shut down the thread pool
        executorService.shutdown();
    }

    static class SearchTask implements Runnable {
        private File file;
        private String searchQuery;

        public SearchTask(File file, String searchQuery) {
            this.file = file;
            this.searchQuery = searchQuery;
        }

        @Override
        public void run() {
            searchInFile(file, searchQuery);
        }

        private void searchInFile(File file, String searchQuery) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                int lineNumber = 1;

                while ((line = reader.readLine()) != null) {
                    if (line.contains(searchQuery)) {
                        System.out.println("Found in file: " + file.getName() + " at line " + lineNumber);
                    }
                    lineNumber++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
