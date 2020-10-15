package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.RentedRoom;

public class Main {

	public static void main(String[] args) throws ParseException{

		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		RentedRoom[] vect = new RentedRoom[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = tc.nextInt();
		
		
		for(int i=0; i<n;i++) {
			System.out.printf("%n Rent # %d: %n" , i+1);
			System.out.print("Name: ");
			tc.nextLine();
			String name = tc.nextLine();
			System.out.print("Email: ");
			String email = tc.nextLine();
			System.out.print("Room: ");
			int numberRoom = tc.nextInt();
			vect[numberRoom] = new RentedRoom(name, email);
			
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i=0; i<vect.length;i++) {
			
			if(vect[i] != null) {
				
				System.out.println("Room " + i + ": " + vect[i]);
				
			}
			/*else {
				
				System.out.println("#### Quartos alugados ####");
			}
			*/
		}
		
		tc.close();
		
	}

}
