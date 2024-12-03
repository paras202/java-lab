 import java.io.*;

public class IOStreamsDemo {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String data = "Hello, this is an example of I/O Streams in Java.";

        // Writing to the file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data.getBytes());
            System.out.println("Data written to file using FileOutputStream.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }

        // Reading from the file using FileInputStream
        try (FileInputStream fis = new FileInputStream(fileName)) {
            System.out.println("Reading data from the file using FileInputStream:");
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println(); // For line break
        } catch (IOException e) {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }

        // Writing to the file using BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.newLine();
            bw.write("This is an additional line written using BufferedWriter.");
            System.out.println("Additional data written to file using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("An error occurred during buffered writing: " + e.getMessage());
        }

        // Reading from the file using BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Reading data from the file using BufferedReader:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during buffered reading: " + e.getMessage());
        }
    }
}
