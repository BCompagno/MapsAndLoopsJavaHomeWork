package loopMapExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarDealer {

	public static void main(String[] args) {
		
		Map<String, String> carMakeByModel = new HashMap<>();
		Scanner input = new Scanner(System.in);
		boolean loop = true;
	
		carMakeByModel.put("Civic", "Honda");
		carMakeByModel.put("Accord", "Honda");
		carMakeByModel.put("CRV", "Honda");
		carMakeByModel.put("Escort", "Ford");
		carMakeByModel.put("Camaro", "Chevrolet");
		carMakeByModel.put("Sierra", "GMC");
		carMakeByModel.put("Yukon", "GMC");
		carMakeByModel.put("Corvette", "Chevrolet");
		carMakeByModel.put("Corolla", "Toyota");
		carMakeByModel.put("F150", "Ford");
		carMakeByModel.put("Pilot", "Honda");
		carMakeByModel.put("CX7", "Mazda");
		
		
		while(loop) {
		
			System.out.println("What kind of car are you looking for today?\n");
			String car=input.nextLine();
		
			if(car.equals("quit")) {
				loop = false;
			}
			else {
				System.out.printf("Oh, your looking for a %s?\n", car.toString());
				if(carMakeByModel.containsKey(car) || carMakeByModel.containsValue(car)) {
					String make = carMakeByModel.get(car);
					System.out.printf("Our %s section is right over here.\n", make);
					for( String key : carMakeByModel.keySet() ) {
						if(make.equals(carMakeByModel.get(key)))
						
							System.out.println(key);
						
					}
				}
				else {
					System.out.printf("I'm sorry, we don't have any %ss.\n", car.toString());
				}
					
			
			}
			
		}

	}

}
