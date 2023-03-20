import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
    
    int[] anArray = new int[] {3, 2, 7, 0, 4, 9, 2, 6, 8, 3};


    String filePath = "log.txt";
    try (FileWriter writer = new FileWriter(filePath, true)) {
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write(Arrays.toString(anArray) + "\n");
        bufferWriter.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    for (int i = 0; i < anArray.length - 1; i++) {
        for(int j = 0; j < anArray.length - i - 1; j++) {
            if(anArray[j + 1] < anArray[j]) {
                int swap = anArray[j];
                anArray[j] = anArray[j + 1];
                anArray[j + 1] = swap;

                try (FileWriter writer = new FileWriter(filePath, true)) {
                    BufferedWriter bufferWriter = new BufferedWriter(writer);
                    bufferWriter.write(Arrays.toString(anArray) + "\n");
                    bufferWriter.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }


        }
    }
}
    System.out.println(Arrays.toString(anArray));   
    }
}
