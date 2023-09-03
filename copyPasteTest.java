import java.io.*;

public class copyPasteTest {
    public static void main(String[] args) {

        try {
            // Define input file stream
            InputStream is = new FileInputStream("test.txt");

            // Define output file stream
            OutputStream os = new FileOutputStream("testDest.txt");

            // Define buffer to hold the content
            byte[] buffer = new byte[1024];

            // read whole content from input file stream and pour to the output file stream
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

            System.out.println("Copy and paste process completes!");

            // (flush) and close both stream
            os.close();
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
