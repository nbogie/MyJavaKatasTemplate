package org.neill.demos.listdir;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainListDir {
    private MainListDir() {

    }

    public static void main(String[] args) throws IOException {

        // TODO: Replace the following with a path on YOUR machine
        String dirPath = "/Users/neill/Developer/Academy/academy-express-api-starter-js";

        try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(Paths.get(dirPath))) {
            for (Path dirItem : dirStream) {

                if (Files.isDirectory(dirItem)) {
                    System.out.println("FOUND FOLDER: " + dirItem);

                } else if (Files.isRegularFile(dirItem)) {
                    System.out.println("FOUND FILE: " + dirItem);
                } else {
                    //could be character device, block device, named pipe, socket, symlink...
                    System.out.println("FOUND other thing: " + dirItem);
                }


            }

        }
    }
}



