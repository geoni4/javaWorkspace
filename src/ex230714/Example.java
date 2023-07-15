package ex230714;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BoardDto {
	int bno;
	String title, text, writer;
	Date nowdate;

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getNowdate() {
		return nowdate;
	}

	public void setNowdate(Date nowdate) {
		this.nowdate = nowdate;
	}

}

public class Example {
	public static void main(String[] args) {
		List<BoardDto> boardDtoList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
//		int bno = 1;
		int bno = 1;
		int select = scanner.nextInt();

		BoardDto boardDto = boardDtoList.get(select);
		System.out.println("글 번호: " + select);
		System.out.println("제목 : " + boardDto.getTitle());
		System.out.println("내용 : " + boardDto.getText());
		System.out.println("작성자 : " + boardDto.getWriter());
		System.out.println("작성날짜 : " + boardDto.getNowdate());
		int arr[] = new int[5];
		int[] arr2 = new int[5];

	}

}
