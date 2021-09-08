package Com.Assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Assignment {

	public static void search(String input) throws FileNotFoundException {
		
		// Time complexity O(n)
		
		
//      C reating a array
		ArrayList<String> arrayOfList = new ArrayList<String>();
        
		
		//creating a object of File clASS in order to read the text
		File myObj = new File("list.txt");
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {        
			String data = myReader.nextLine();
			arrayOfList.add(data);

		}

	
		if (arrayOfList.contains(input)) {
			System.out.println("Got the element :" +input +" "+ "at this index"+  arrayOfList.indexOf(input));
		} else {
			System.out.println("elements was not there");
		}
		myReader.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in) ;
		System.out.print("Enter the word that you want to search"+ " ");
		String text = scan.nextLine();
		search(text);
		

	}

}
