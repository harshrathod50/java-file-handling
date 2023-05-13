import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String nm = s.nextLine();
        System.out.println();
        appendToFile(nm);
    }

    public static void appendToFile(String fileName) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the text you want to append to file:");
            out.write(s.nextLine());
            out.close();
            System.out.println("Appended to file successfully! 🎉");
        } catch (IOException e) {
            System.out.println("exception occurred" + e);
        }
    }
}
