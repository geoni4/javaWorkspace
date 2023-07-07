package com.project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

public class BoardService {
	BoardDAO dao = new BoardDAO();
	
	public Board findOne(int num) {
		return dao.getOne(num);
	}
	
	public Map<Integer, Board> findAll(){
		return dao.getAll();
	}
	
}
