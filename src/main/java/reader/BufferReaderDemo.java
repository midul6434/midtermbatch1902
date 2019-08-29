package reader;

import java.io.*;

public class BufferReaderDemo {
    /**
     *
     *  Use BufferReader to read from buffer while reading Key-To-Success.txt from main/java/resources
     *
     * */
    public static void main(String[] args) {
        File file = new File(System.clearProperty("user.dir")+"/src/main/resources/Key-To-Success");
        try {
           FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i;
            while ((i = bufferedReader.read()) != -1) {
                System.out.print((char) i);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }
