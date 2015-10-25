import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		 //Retrieving the ArraySize
		int numberOfItems=stdIn.nextInt();
		 //Buffer for reversed Array
		int [] reversedArray=new int [numberOfItems];
        	//Retreiving the numbers and storing in reversed order
		for (int i=1; i<=numberOfItems; i++) reversedArray[numberOfItems-i]=stdIn.nextInt();
		//Echoing 
		for (int i=0; i<numberOfItems; i++)  System.out.printf("%d ",reversedArray[i]); 
	}

}
