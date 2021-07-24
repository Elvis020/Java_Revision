import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading_Files_Runner {
    public static void main(String[] args) throws FileNotFoundException {
        String myFile = "/home/elvis/Documents/test99";

        //Creating file object
        File file = new File(myFile);

        // Using Scanner to read the file
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close(); // don't forget to close opened files
    }
}
