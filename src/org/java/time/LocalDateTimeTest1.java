package org.java.time;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.java.dto.FullCalenderDto;

public class LocalDateTimeTest1 {

	public static void main(String[] args) {

		System.out.println("예약 -> 시작일, 종료일 입력");

		// String reserveTitle="";//
		// String start="시작일";//
//		LocalDateTime startDay= LocalDateTime.of(2025, 11,1,12,0,0);
		// String end="종료일";//
//		LocalDateTime endDay= LocalDateTime.of(2025, 11,14,12,0,22);

		// Scanner 이용, while
		// 예약 내용~
		// 예약시간 시작일~ 종료일~
		// 시작일이 종료일보다 크거나같으면
		// "예약일은 시작일 보다 이후이어야합니다. 다시 예약일을 입력하세요" 콘솔에 출력후 다시입력
		// 예약 종료후 예약시작일과 예약 종료일을 콘솔에 출력
		// FullCalenderDto에 예약일과 종료일 이용

		Scanner input = new Scanner(System.in);

		boolean bool = false;

		String reserveTitle = "";

		int sYear = 0;
		int sMonth = 0;
		int sDay = 0;
		int sHour = 0;
		int sMinute = 0;
		int sSecond = 0;

		int eYear = 0;
		int eMonth = 0;
		int eDay = 0;
		int eHour = 0;
		int eMinute = 0;
		int eSecond = 0;

		LocalDateTime startDay = null;
		LocalDateTime endDay = null;

		while (!bool) {
			System.out.print("예약프로그램을 시작하시겠습니까?(y,n): ");
			String q = input.next();

			if (q.equals("y")) {

				while (!bool) {
					System.out.println("예약을 진행 하시겠습니까?(y,n)");
					String q2 = input.next();

					if (q2.equals("y")) {
						System.out.print("예약을 내용 입력:  ");
						reserveTitle = input.next();

						System.out.print("예약 시작년:  ");
						sYear = input.nextInt();

						System.out.print("예약 시작월:  ");
						sMonth = input.nextInt();

						System.out.print("예약 시작일:  ");
						sDay = input.nextInt();

						System.out.print("예약 시작시:  ");
						sHour = input.nextInt();

						System.out.print("예약 시작분:  ");
						sMinute = input.nextInt();

						System.out.print("예약 시작초:  ");
						sSecond = input.nextInt();

						System.out.println();

						System.out.println("예약 종료일 입력!!");

						System.out.print("예약 종료년:  ");
						eYear = input.nextInt();

						System.out.print("예약 종료월:  ");
						eMonth = input.nextInt();

						System.out.print("예약 종료일:  ");
						eDay = input.nextInt();

						System.out.print("예약 종료시:  ");
						eHour = input.nextInt();

						System.out.print("예약 종료분:  ");
						eMinute = input.nextInt();

						System.out.print("예약 종료초:  ");
						eSecond = input.nextInt();

					} else {
						System.out.println("종료!!");
						break;
					}
				}

			} else {
				System.out.println("종료!");
				bool = true;
			}

		}

//		LocalDateTime startDay = null;
//		LocalDateTime endDay = null;

		// 사용자 입력정보 -> Controller -> DTO -> DAO -> JDBC(드라이버),DB연동 -> DB 저장
		if (!reserveTitle.equals("")) {
			System.out.println(reserveTitle);
			System.out.print("예약 시작일: ");
			System.out.print(sYear + "년 " + sMonth + "월 " + sDay + "일 ");
			System.out.println(sHour + "시 " + sMinute + "시 " + sSecond + "초");
			startDay = LocalDateTime.of(sYear, sMonth, sMonth, sHour, sMinute, sSecond);

			System.out.print("예약 종료일: ");
			System.out.print(eYear + "년 " + eMonth + "월 " + eDay + "일 ");
			System.out.println(eHour + "시 " + eMinute + "시 " + eSecond + "초");
			endDay = LocalDateTime.of(eYear, sMonth, eMonth, eHour, eMinute, eSecond);
		}
		boolean bool2 = startDay.isBefore(endDay);
		
		if (!bool2) {
			System.out.println("예약시작일은 예약 종료일보다 이전일이어야 합니다!!");
		} else {
			System.out.println("예약가능합니다. 예약일을 선택해 주세요!!");

			System.out.println("예약가능일: " + endDay);
			FullCalenderDto fullCalenderDto = new FullCalenderDto(startDay, endDay);
			System.out.println(fullCalenderDto.toString());
		}

		input.close();

	}

}
