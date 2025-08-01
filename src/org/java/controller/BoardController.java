package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import org.java.dto.BoardDto;
import org.java.service.BoardService;
import org.java.service.impl.BoardServiceImpl;

public class BoardController {

	public static void main(String[] args) throws IOException, SQLException {

		System.out.println("BoardController");

		Scanner input = new Scanner(System.in);
		boolean bool = false;

		while (!bool) {
			System.out.print("예제를 실행 하시겠습니다!(exit-> 종료): ");
			String quest = input.next();
			if (!quest.equals("exit")) {
				System.out.print("쿼리문을 입력하세요(insert,update,select,delete,detail): ");
				String query = input.next();
				// 다형성 -> 부모타입의 객체 참조변수
				BoardService service = new BoardServiceImpl();

				if (query.equals("insert")) {

					System.out.println("게시글작성 실행! ");

					System.out.print("글번호: ");
					int boardId = input.nextInt();

					System.out.print("title: ");
					String title = input.next();

					System.out.print("content: ");
					String content = input.next();

					System.out.print("memberId");
					int memberId = input.nextInt();

					service.save(new BoardDto((long) boardId, title, content, 0, (long) memberId, LocalDateTime.now(),
							null));
				} else if (query.equals("update")) {

				} else if (query.equals("delete")) {

				} else if (query.equals("detail")) {

				} else if (query.equals("select")) {

				} else if (query.equals("exit")) {
					System.out.println("예제를 종료하겠습니다!");
					bool = true;
				} else {
					System.out.println("쿼리문 입력오류입니다!!");
				}
			} else {
				System.out.println("예제를 종료하겠습니다!");
				bool = true;
			}

		}

		input.close();
	}

}
