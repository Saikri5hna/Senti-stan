import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 import java.io.*;

public class 1line1xml {

	public static void main(String[] args) {
   int i=0;

		BufferedReader br = null;
		try {
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("100lines.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				 i++;

				try {
 
			String content = sCurrentLine;
 String str = Integer.toString(i);
			File file = new File(str);
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
				System.out.println(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
	}
}
//finally excecute corenlp as java java -mx3g -cp "$scriptdir/*" edu.stanford.nlp.pipeline.StanfordCoreNLP -file "files" $*
