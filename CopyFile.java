import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class CopyFile {
    public static void main (String[] args) {

        Scanner userInputScan = new Scanner(System.in);
        Scanner fileScan = null;

        do {
            System.out.println("Enter a file name: ");
            String filename = userInputScan.nextLine();
            File file = new File(filename);

            try {
                fileScan = new Scanner(file);
                System.out.println("This file does exist.");
            } catch (FileNotFoundException e) {
                System.out.println("This file does not exist.");
            }

        } while (fileScan == null);

        while (fileScan.hasNextLine()) {
            System.out.println(fileScan.nextLine());
        }

    }
}
