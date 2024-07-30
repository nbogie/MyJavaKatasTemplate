package org.neill.demos.findjsfiles;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
public class MainFindJSFiles {
    private MainFindJSFiles() {
    }
    public static void main(String[] args) throws IOException {
        // TODO: Replace the following with your starting path
        String startPath = "./exampleFiles";
        System.out.println("For this demo to be interesting, set startPath to point at the top of a directory tree which contains some .js (and .ts) files at different depths");

        List<Path> jsTsFiles = findJsTsFiles(startPath);
        reportPaths(jsTsFiles);
    }


    public static List<Path> findJsTsFiles(String startPath) throws IOException {
        Path start = Paths.get(startPath);

        // Using Files.walk to efficiently traverse the file tree
        try (Stream<Path> stream = Files.walk(start)) {
            return stream
                    .filter(Files::isRegularFile)
                    .filter(MainFindJSFiles::isJSOrTSFile)
                    .toList();
        }
    }

    private static boolean isJSOrTSFile(Path path) {
        return path.toString().endsWith(".js") || path.toString().endsWith(".ts");
    }



    private static void reportPaths(List<Path> jsTsFiles) {
        System.out.println("Found " + jsTsFiles.size() + " JS/TS files:");
        for (Path file : jsTsFiles) {
            System.out.println(file);
        }
    }


}