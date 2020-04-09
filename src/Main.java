import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Queen> queenList = new ArrayList<Queen>();

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int id = 0;
		
		//input x and y coordinates of queen
		print("Enter queen row: ");
		int x = scanner.nextInt();
		print("Enter queen column: ");
		int y = scanner.nextInt();
		id++;
		
		//create first queen object
		queenList.add(new Queen(new Position(x,y) , id));
		
		//loop for creating queen objects
		while(true) {
			print("\nEnter queen row: ");
			int a = scanner.nextInt();
			print("Enter queen column: ");
			int b = scanner.nextInt();
			
			id++;
			
			Queen queen = new Queen(new Position(a,b), id);
			
			//check if new queen overlaps path with other queens
			if(check(queen)) {
				print("New queen added to board! (ID:" +queen.getID() +" Position:" +queen.getPosition() +")\n");
				queenList.add(queen);
			}else if(!check(queen)) {
				break;
			}
		}
		scanner.close();
	}
	
	//helper method for checking queen path
	public static boolean check(Queen queen) {
		//for-each loop to check if new queen overlaps path with existing queens
		for(Queen q : queenList) {
			if(q.getRow() == queen.getRow() || q.getColumn() == queen.getColumn() || Math.abs(q.getRow() - queen.getRow()) == Math.abs(q.getColumn() - queen.getColumn())) {
				return false;
			}
		}
		return true;
	}
	
	public static void print(String in) {
		System.out.print(in);
	}
}
