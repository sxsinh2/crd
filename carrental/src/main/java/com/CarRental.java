package com;
import java.util.*;

public class CarRental {
	public static void main(String args[]) {
		CarRental cr = new CarRental();
		cr.rentACar();
	}

	public static ArrayList<Car> getInventoryList() {
		
		ArrayList<Car> inventory = new ArrayList<Car>();
		inventory.add(new Car(1,"Sedan",  60, "Open"));
		inventory.add(new Car(2,"SUV",  50, "Open"));
		inventory.add(new Car(3,"Van",  100, "Open"));
		inventory.add(new Car(4,"Sedan",  160, "Open"));
		inventory.add(new Car(5,"SUV",  150, "Open"));
		inventory.add(new Car( 6,"Sedan", 270, "Open"));
		return inventory;
	}

	public void rentACar(){
	try{
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please Enter Your Name: ");
		String custName = userInput.nextLine();
		System.out.println("Hello "+ custName);
		System.out.println("Please choose from our inventory below");
		System.out.println("Item# Type Rate");
		ArrayList<Car> rentalInventory = getInventoryList();
		for (Car i : rentalInventory ){
			System.out.println(i.getItemNumber() + " "+ i.getType() + " "+i.getDailyRate());
		}
		System.out.print("Please select Car ItemNumber to book: ");
		int itn = userInput.nextInt();
		System.out.print("Enter number of days to rent: ");
		int days = userInput.nextInt();
		System.out.print("Enter the start day in dd-mm-yy: ");
		String startDate = userInput.next();
		boolean itemFound=true;
		for (Car ri : rentalInventory){
			if (itn == ri.getItemNumber()){			
				int cost = (days * ri.getDailyRate()) ;
				System.out.println("DailyRate  Duration  TotalCost");
				System.out.println( ri.getDailyRate()+" " +days + " "+cost);
				System.out.print("Do you want to proceed Y/N: ");
				String response = userInput.next();
				if(response.equalsIgnoreCase("y")){
					System.out.println("Your car is now booked from " + startDate);
					ri.setReservationStatus("booked");
					itemFound=true;
					break;
				}else{
					System.out.println("No problem. Thank You");
				}
			}else{
				itemFound = false;
			}
		}
		if(!itemFound) {
			System.out.println("Item not found. Please retry");
		}
	}catch(InputMismatchException exception){
		System.out.println("Invalid entry. Please retry");
	}
	}
	
}