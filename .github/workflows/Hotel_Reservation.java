package Hermosura;

import java.util.Scanner;
import java.io.*;

public class Hotel_Reservation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int hotel[][] = new int[7][5];
		
		hotel = new int [][]{{0,1,0,0,1},{0,0,0,1,0}};
		int option = 0;
		
		System.out.print("==== Welcome to Isla Resort Hotel ====");
		System.out.print("Select option: "
		
				+ "\n\n[1] Details"
				+ "\n[2] Transaction"
				+ ""
				+ "\n\nEnter choice: ");
		int mainOption = sc.nextInt();
		
		switch (mainOption) {
		case 1:
			System.out.print("--Details--\n");
			System.out.print(""
					+ "\nFounder     : Estelle Hermosura"
					+ "\nDate Founded: 2013"
					+ "\nLocation    : Davao City"
					+ "\n\nBusiness Partnerships: "
					+ "\n      Kopiko Pantropiko      Del Monte Inc."
					+ "\n      SB19                   ALAMAT");
			
			System.out.print("\n\n>>> Restart to go back to Main Menu <<<");
			break;
			
		case 2:
			do {
				System.out.println("--Transaction--\n");
				System.out.print("[1] View all rooms\r\n"
						+ "[2] Check-in (reserve a room)\r\n"
						+ "[3] Check-out (free a room)\r\n"
						+ "[4] Exit program"
						+ ""
						+ "\n\nEnter choice: ");
				option = sc.nextInt();
				
				
				switch (option) {
				
				case 1: 
	                
	                for (int i = 0; i < hotel.length; i++) {
	                    System.out.print("Floor " + (i + 1) + ": ");
	                    for (int j = 0; j < hotel[i].length; j++) {
	                        if (hotel[i][j] == 0) {
	                            System.out.print("[0] ");
	                        } else {
	                            System.out.print("[1] ");
	                        }
	                    }
	                    System.out.println();
	                }
					
					
					break;
				case 2: 
					System.out.println("== Check in ==");
					
					System.out.print("Enter floor (1-7): ");
					int checkInFloor = sc.nextInt();
					
					System.out.print("Enter room (1-5): ");
					int checkInRoom = sc.nextInt();
					
					if (checkInFloor < 1 || checkInFloor > 7 || checkInRoom < 1 || checkInRoom > 5) {
	                    System.out.println("Invalid floor or room number.");
	                } else if (hotel[checkInFloor - 1][checkInRoom - 1] == 1) {
	                    System.out.println("Room is already occupied!");
	                } else {
	                    hotel[checkInFloor - 1][checkInRoom - 1] = 1;
	                    System.out.println("Successfully checked in to Floor " + checkInFloor + ", Room " + checkInRoom + ".");
	                }
					break;
				case 3:
					System.out.println("== Check Out ==");
					
					System.out.print("Enter floor (1-7): ");
					int checkOutFloor = sc.nextInt();
					
					System.out.print("Enter room (1-5): ");
					int checkOutRoom = sc.nextInt();
					
					if (checkOutFloor < 1 || checkOutFloor > 7 || checkOutRoom < 1 || checkOutRoom > 5) {
                        System.out.println("Invalid floor or room number.");
                    } else if (hotel[checkOutFloor - 1][checkOutRoom - 1] == 0) {
                        System.out.println("Room is already vacant!");
                    } else {
                        hotel[checkOutFloor - 1][checkOutRoom - 1] = 0;
                        System.out.println("Successfully checked out from Floor " + checkOutFloor + ", Room " + checkOutRoom + ".");
                    }
					
					break;
				default:
					System.out.print("\nThank you for doing business with us!");
					break;
				}
				
			} while(option !=4);
			
			break;
		}
	}

}
