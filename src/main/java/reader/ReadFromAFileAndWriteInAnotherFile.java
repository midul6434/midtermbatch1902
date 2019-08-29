package reader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class ReadFromAFileAndWriteInAnotherFile {

    /***
     * Read form a file XXXXXX write in a file YYYYYY
     *
     * */
    public static void main(String[] args) {
        try {

            FileInputStream in = new FileInputStream(System.clearProperty("user.dir") + "/src/main/resources/xxxxxx");
            FileOutputStream out = new FileOutputStream("/Users/midul/IdeaProjects/midtermbatch1902/src/main/resources/yyyyyyyyy");
            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
