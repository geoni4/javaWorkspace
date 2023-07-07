package com.project1.DAO;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.project1.DO.Board;

public class BoardDAO {
	private int counter;
	
	public int getCounter() {
		return counter;
	};
	
	public Board getOne(int num) {
		Board board = null;
		for(int i =0;i<getCounter();i++) {
//			if(board.getNum() == num)
//				board = 
			
		}
		
		return board;
	}
	
	public List<Board> getList() {
		List<Board> list = new ArrayList<Board>();
		
		return list;
	}
	
	public void insertBoard() {
		
	}
}
