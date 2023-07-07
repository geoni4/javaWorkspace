package com.project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoardDAO {
	BufferedReader br = null;
	FileWriter fw = null;
	
	public Board getOne(int num) throws Exception{
		Scanner scanner = new Scanner(System.in);
		br = new BufferedReader(new FileReader("string.txt"));
		Board board;
		String n = scanner.nextLine();
		while(true) {
			if(n == null)	break;
			if(br.readLine() == null) break; 
			for(int i =0;i<4;i++) {
				br.readLine();
				
			} 
		}
		return board;
	}
	
	public Map<Integer, Board> getAll(){
		return new HashMap<Integer, Board>();
	}
}
