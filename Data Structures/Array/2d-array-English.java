import java.util.ArrayList;
import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		int MEMBER_SIZE=6;
		int [][] members=new int[MEMBER_SIZE][MEMBER_SIZE];
		
		//Retrieveing the memebers from standard input
		for (int i=0;i<MEMBER_SIZE;i++){
			for (int j=0;j<MEMBER_SIZE;j++) members[i][j]=stdIn.nextInt();
		}
		
		int maxValueOfHourGlass=0;
		for(int i=0; i<MEMBER_SIZE-2; i++){
			for(int j=0; j<MEMBER_SIZE-2; j++){
				int totalCountOfCurrentHourGlass=getTotalCountOfHourGlass(i,j,members);
				if(totalCountOfCurrentHourGlass>maxValueOfHourGlass)maxValueOfHourGlass=totalCountOfCurrentHourGlass;
			}
		}
		
		System.out.println(maxValueOfHourGlass);
	}
	
	public static int getTotalCountOfHourGlass(int xPosition, int yPosition, int[][] members){
		int total=0;
		total+=members[xPosition][yPosition];
		total+=members[xPosition][yPosition+1];
		total+=members[xPosition][yPosition+2];
		total+=members[xPosition+1][yPosition+1];
		total+=members[xPosition+2][yPosition];
		total+=members[xPosition+2][yPosition+1];
		total+=members[xPosition+2][yPosition+2];
		return total;
	}
}

