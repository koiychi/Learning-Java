import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterSample_Rodriguez {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter (new FileWriter("output_rodriguez.txt"));

            writer.write("Hello, this is my first line using BufferedWriter!");
            writer.newLine();
            writer.write("BufferedWriter makes writing files easy and fast.");

            writer.close();
            System.out.println("File writing successful! Check output_rodriguez.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
