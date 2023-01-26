package readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {

        String myFile = "C:\\Users\\Leticia\\Documents\\IntelliJ_IDEA\\Practice-Basics\\test.txt";

        File file = new File(myFile);

        Scanner text = new Scanner(file);

        while(text.hasNextLine()) {
            String line = text.nextLine();

            System.out.println(line);
        }

        text.close();
    }
}
