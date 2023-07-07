package com.project1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.project1.Board;

public class ProjectMain {
	static Scanner scanner = new Scanner(System.in);
	static Map<Integer, Board> list = null;

	public static void main(String[] args) {
		int menu = 0;
		int bno = 0;
		while (true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.print("1. 목록  2. 등록  3. 내용  4. 삭제  0. 종료 > ");

			try {
				menu = scanner.nextInt();
				scanner.nextLine();
			} catch (Exception e) {
				System.out.println("메뉴를 잘 입력하세요.");
				continue;
			}
			if (menu == 1) {
				if (list == null) {
					System.out.println("글 목록이 없음.");
					System.out.println();
					continue;
				}
				System.out.println("========================================");
				System.out.println("번호	제목	작성자	작성일	");
				System.out.println("----------------------------------------");

				for (Integer key : list.keySet()) {
					Board value = list.get(key);
					System.out.println(value);
				}
				System.out.println("========================================");
				System.out.println();
			} else if (menu == 2) {
				LocalDateTime localDateTime = null;
				
				String title = null, content=null, writer=null, createDate, modifyDate;
				try {
					System.out.print("제목> ");
					title = scanner.nextLine();
					System.out.print("내용> ");
					content = scanner.nextLine();
					System.out.print("작성자> ");
					writer = scanner.nextLine();
				} catch (Exception e) {
					System.out.println("제대로 입력하세요.");
					continue;
				}
				localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy, h:MM:ss a");
				String date = localDateTime.format(dtf);
				Board board = new Board(++bno, title, content, writer, date, date);
				if (list == null)
					list = new HashMap<>();
				list.put(bno, board);
				System.out.println("글 작성이 완료되었습니다.");
			} else if (menu == 3) {
				int num;
				System.out.print("내용을 확인할 글 번호를 입력하세요> ");
				try {
					num = scanner.nextInt();
				} catch (Exception e) {
					System.out.println("번호를 입력하세요.");
					continue;
				}
				scanner.nextLine();
				Board board=null;
				try {
					board = list.get(num);
					System.out.println(board.toString());
				} catch(NullPointerException e) {
					System.out.println("글이 없습니다.");
					continue;
				}
					
				
				System.out.println("---------------------제목---------------------");
				System.out.println(board.getTitle());
				System.out.println();
				System.out.println("--------------------작성자---------------------");
				System.out.println(board.getWriter());
				System.out.println();
				System.out.println("-------작성 날짜------- | -------수정된 날짜-------");
				System.out.println();
				System.out.println(board.getCreateDate() + "|" + board.getModifyDate());
				System.out.println("---------------------내용---------------------");
				System.out.println(board.getContent());
				System.out.println();
			} else if (menu == 4) {
				int num;
				System.out.print("삭제할 글 번호를 입력하세요> ");
				try {
					num = scanner.nextInt();
				} catch (Exception e) {
					System.out.println("번호를 입력하세요.");
					continue;
				}
				if ( list.get(num) != null) {
					System.out.println("글이 삭제되었습니다.");
				} else {
					System.out.println("글이 없습니다.");
				}
			} else if (menu == 0) {
				break;
			}
		}
		System.out.println("종료합니다.");
	}

}

