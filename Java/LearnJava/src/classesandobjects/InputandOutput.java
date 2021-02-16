package classesandobjects;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class InputandOutput {

	public static void main(String[] args) {
		try {
			loadFile("file.txt");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}
	
	static void loadFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		Path file = FileSystems.getDefault().getPath("/Users/hnguyen/qa-development/Tutorials/Java/LearnJava/src/classesandobjects", 
				filename);
		System.out.println(file);
		List<String> lines = Files.readAllLines(file);
		
		//for (int i=0; i<lines.size(); i++) {
		//	System.out.println(lines.get(i));
		//}
		
		// lines.forEach((str) -> System.out.println(str));
		lines.forEach(System.out::println);
	}

}
