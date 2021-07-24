import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Handling_Exceptions {
    public static void main(String[] args) {
        // There are 2 ways of handling exceptions
        // 1. by adding throws <ExceptionName> to the function
        // 2. by adding a try-catch
        File file1 = new File("example.txt");
        try {
            Scanner sc = new Scanner(file1);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(file1 + " does not exist");
        }

        System.out.println("File search ends");

        try {
            readFromFile();
        } catch (FileNotFoundException e) {System.out.println("Can't find file");}
    }

    static void readFromFile() throws FileNotFoundException{
        File file2 = new File("kk");
        Scanner sc = new Scanner(file2);
        sc.close();
    }
}
