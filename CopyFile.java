import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class CopyFile {
    public static void main (String[] args) {
        File file = new File("/Users/breconmorgan/Documents/file.txt");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a file name: ");
            scan.nextLine();
            if (!file.exists()) {
                throw new FileNotFoundException();
            } else {
                System.out.println("This file does exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("This file was not found.");
        } finally {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a file name: ");
            scan.nextLine();
        }

    }
}
