package org.neill.katas.findjsfiles;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
public class MainFindJSFiles {
    private MainFindJSFiles() {
    }

    public static List<Path> findJsTsFiles(String startPath) throws IOException {
        Path start = Paths.get(startPath);

        // Using Files.walk to efficiently traverse the file tree
        try (Stream<Path> stream = Files.walk(start)) {
            return stream
                    .filter(Files::isRegularFile) // Only consider regular files
                    .filter(MainFindJSFiles::isJSOrTSFile)
                    .toList();

        }
    }


    private static boolean isJSOrTSFile(Path path) {
        return path.toString().endsWith(".js") || path.toString().endsWith(".ts");
    }
    public static void main(String[] args) throws IOException {
        String startPath = "/path/to/your/directory"; // Replace with your starting path
        List<Path> jsTsFiles = findJsTsFiles(startPath);
        reportPaths(jsTsFiles);
    }

    private static void reportPaths(List<Path> jsTsFiles) {
        System.out.println("Found " + jsTsFiles.size() + " JS/TS files:");
        for (Path file : jsTsFiles) {
            System.out.println(file);
        }
    }

}