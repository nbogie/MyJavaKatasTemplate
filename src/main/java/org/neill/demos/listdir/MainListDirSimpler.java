package org.neill.demos.listdir;

import java.io.File;

public class MainListDirSimpler {
    public static void main(String[] args) {

        // TODO: Replace the following with a path on YOUR machine
        String dirPath = "/Users/neill/Developer/Academy/academy-express-api-starter-js";

        File dir = new File(dirPath);
        if (!dir.isDirectory()) {
            System.out.println("Not a directory: " + dirPath);
            return;
        }
        File[] files = dir.listFiles();
        if (files == null) {
            System.out.println("listFiles() yielded null");
            return;
        }

        for (File dirItem : files) {
            if (dirItem.isDirectory()) {
                System.out.println("FOUND FOLDER: " + dirItem);

            } else if (dirItem.isFile()) {
                System.out.println("FOUND FILE: " + dirItem);
            } else {
                //what could it be? Character device, block device, named pipe, socket, symlink?
                System.out.println("FOUND non-file / non-directory: " + dirItem);
            }
        }
    }

    private MainListDirSimpler() {
        //It is not intended that this class be instantiated.
    }


}



