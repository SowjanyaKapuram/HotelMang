package com.capgemini.HotelManagement;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.hma.DTO.CustDetails;
import com.cg.hma.DTO.RoomDetails;
import com.cg.hma.Service.HotelMangServiceImpl;
import com.cg.hma.Service.IHotelMangService;

public class App {
	static int i;
	public static void main(String[] args) {
	
		RoomDetails roomDetails = new RoomDetails();
		CustDetails custDetails = new CustDetails();
		IHotelMangService hotelMangService = new HotelMangServiceImpl();
		CustDetails j;
		Scanner sc = new Scanner(System.in);
do {
		System.out.println("Enter 1.Book Room 2. View Booking status 3. Exit");
		int menu = sc.nextInt();
		switch (menu) {

		case 1:
			System.out.println("Enter Cust name: ");
			custDetails.setName(sc.next());
			System.out.println("Enter Email:");
			custDetails.setEmail(sc.next());
			System.out.println("Enter cust address");
			custDetails.setAddress(sc.next());
			System.out.println("Enter mobile no");
			custDetails.setMobile(sc.next());
			System.out.println("Enter Room No");
			custDetails.setRoomNo(sc.nextInt());
			System.out.println("Enter Room Type");
			custDetails.setRoomType(sc.next());

			 i = hotelMangService.bookRoom(custDetails);

			if (i == 0) {
				System.out.println("Invalid");
			} else 
				 
					System.out.println("Successfully booked. Cust_Id:" + i);
				 
			
			break;
		case 2:
			System.out.println("Enter CustId");
			int id = sc.nextInt();

			custDetails = hotelMangService.bookingStatus(id);
			if (custDetails == null)
				System.out.println("Invalid Id");
			else {
				System.out.println("Name of the customer:" + custDetails.getName());
				System.out.println("Booking Status: Booked");
				System.out.println("Room No:" + custDetails.getRoomNo());
				System.out.println("Room Type: " + custDetails.getRoomType());
			}
			break;

		case 3:
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}while(true);
	
}
}
