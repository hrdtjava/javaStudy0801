package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.java.dto.ItemDto;
import org.java.service.ItemService;
import org.java.service.impl.ItemServiceImpl;

public class ItemController {

	public static void main(String[] args) throws IOException, SQLException {
		
		System.out.println("ItemController");
		Scanner input = new Scanner(System.in);
		boolean bool = false;

		while (!bool) {
			System.out.print("예제를 실행 하시겠습니다!(exit-> 종료): ");
			String quest = input.next();
			if (!quest.equals("exit")) {
				System.out.print("쿼리문을 입력하세요(insert,update,select,delete,detail): ");
				String query = input.next();
				// 다형성 -> 부모타입의 객체 참조변수
				ItemService service = new ItemServiceImpl();

				if (query.equals("insert")) {

					System.out.println("상품등록 실행! ");
					
					System.out.print("상품번호: ");
					int itemId = input.nextInt();

					System.out.print("itemName: ");
					String itemName = input.next();

					System.out.print("itemPrice");
					int itemPrice = input.nextInt();

					System.out.print("itemDetail: ");
					String itemDetail = input.next();

					System.out.print("inventory");
					int inventory = input.nextInt();

					service.save(new ItemDto((long)itemId, itemName,  itemPrice,itemDetail,inventory, LocalDateTime.now(),	null));					
					
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
