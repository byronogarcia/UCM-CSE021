package io;

import java.util.*;
import java.io.*;

public class PhoneNums {

	public ArrayList<String> readPhoneNumbers() {
		String code;
		String area;
		String number;
		
		String filename = "data/phone.txt"; 
		ArrayList<String> output = new ArrayList<String>();
		
		
		try {
			Scanner input = new Scanner ( new FileReader(filename) );

			while (input.hasNextLine()) {
				Scanner line = new Scanner(input.nextLine());
				line.useDelimiter("[+ -]"); 
				code = line.next();
				area = line.next();
				number = line.nextLine();
				
				System.out.println("Country Code: " + code.replace("-", ""));
				System.out.println("Area Code: " + area.replace("+", ""));
				System.out.println("Phone Number: " + number.replace("-", ""));
				
				
				if (line.hasNext())
					System.out.print(line.next());   
				
				
			} 
			input.close();
		} catch ( NoSuchElementException e){
			System.out.println(e);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		return output;
		
	}
	
	

}