package ex230629;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionMain {
	
	
	public static void exceptionTest() throws IOException{
		
	}
	
	public static void main(String[] args) throws IOException {
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		BufferedWriter writer = null;

		writer = Files.newBufferedWriter(file);

		writer.write('A');
		writer.write('Z');

		if (writer != null) {
			writer.close();
		}

		// TODO: handle exception

	}
}
