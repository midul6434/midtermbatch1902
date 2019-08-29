package reader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class DataReader {

	public static void main(String[] args) {

		/**
		 * Use API to read the below textFile and print to console.
		 * /src/main/resources/Key-To-Success
		 * Use FileReader class, no need to store in buffer
		 * Use try....catch block to handle Exception.
		 * Use ForEach loop/while loop/Iterator to retrieve data.
		 */
		File file = new File("/Users/midul/IdeaProjects/midtermbatch1902/src/main/resources/Key-To-Success");
		try{
		FileReader fileReader = new FileReader(file);

		int i;
		while ((i=fileReader.read())!=-1) {
			System.out.print((char) i);
		}
		}
		catch (Exception e){
			e.printStackTrace();
		}

	}

}
