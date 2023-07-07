package exafter230706;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GoogleDocsExample {
	public static void main(String[] args) {
		String ks = "공부에 있어서 돈이 꼭 필요한 것은 아니다.";
	    String es = "Life is long if you know how to use it.";
	    try (BufferedWriter wr = new BufferedWriter(new FileWriter("string.txt"))){
	    	wr.write(ks, 0, ks.length());
	    	
	    	wr.newLine();
	    	wr.write(es, 0, es.length());
	    	wr.close();
	    }catch (IOException e) {
	    	e.printStackTrace();
		}
	    
	    try(BufferedReader rd = new BufferedReader(new FileReader("string.txt"))){
	    	String data;
	    	while(true) {
	    		data = rd.readLine();
	    		if(data == null) break;
	    		System.out.println(data);
	    	}
	    	rd.close();
	    }catch (IOException e) {
	    	e.printStackTrace();
		}
	    
	//string.txt  
	}
}
