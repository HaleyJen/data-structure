package A03tree;

import java.io.File;

public class DirectoryTraversal {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\haley\\Desktop\\inbox\\0 english";
        File rootFolder = new File(filePath);
        traverseDFS(rootFolder);


    }

    static void traverseDFS(File dir){
        if (dir == null || !dir.isDirectory()) return;

        System.out.println("📁 " + dir.getAbsolutePath());

        File[] files = dir.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                traverseDFS(file); // Recursive call for subfolder
            }
        }

    }
}
