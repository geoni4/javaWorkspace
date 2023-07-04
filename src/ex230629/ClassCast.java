package ex230629;

class Board{}

class PBoard extends Board{
	
}

public class ClassCast {
	public static void main(String[] args) {
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard) pbd1;
		
		System.out.println(".. intermediate location .. ");
		Board ebd1 = new Board();
		PBoard edb2 = (PBoard) ebd1; // Exception
		
	}
}
