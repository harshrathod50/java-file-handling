import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String nm = s.nextLine();
        System.out.println();
        writeToFile(nm);
    }

    private static void writeToFile(String fileName) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the text you want to write to file:");
            myWriter.write(s.nextLine());
            myWriter.close();
            System.out.println("Written to file successfully! 🎉");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
