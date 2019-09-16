

import java.util.Scanner;
public class Unit32 {

	public static void main(String[] args) {
		String myWords= "Hello Justan 18";
		Scanner inStream= new Scanner(myWords);
		
		String greeting = inStream.next();
		String name =inStream.next();
		int age= inStream.nextInt();
		
		System.out.printf("The age of %s is %d", name, age);
		
	

	}

}
